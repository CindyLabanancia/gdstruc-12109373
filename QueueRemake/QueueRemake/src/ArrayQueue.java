import java.util.NoSuchElementException;

public class ArrayQueue {
    private Player[] queue;
    private  int front;
    private  int back;
    private int gameStartCounter = 0;

    public ArrayQueue(int capacity) {
        queue = new Player[capacity];
        front = 0;
        back = 0;
    }

    // add player at the back of the queue
    public void enqueue(Player player) {

        if(gameStartCounter >= 10) {
            return;
        }

        if (back == queue.length) {
            gameStartCounter++;
            System.out.println();
            System.out.println("== A game started! ==");
            System.out.println("== Removing players in queue ==");
            for(int i = 0; i < 5; i++) {
                System.out.println("[-] " + dequeue().getName() + " has been removed from the queue");
            }
            System.out.println();
        }

        queue[back] = player;
        System.out.println("[+] " + player.getName() + " has joined the queue");

        // check again after adding player to the queue
        if (back == queue.length) {
            gameStartCounter++;
            System.out.println();
            System.out.println("== A game started! ==");
            System.out.println("== Removing players in queue ==");
            for(int i = 0; i < 5; i++) {
                System.out.println("[-] " + dequeue().getName() + " has been removed from the queue");
            }
            System.out.println();
        }

        back++;
    }

    public int getGameStartCounter() {
        return gameStartCounter;
    }

    // remove the player that is in front of the queue
    public Player dequeue() {
        if (size() == 0) {
            throw  new NoSuchElementException();
        }

        Player removedPlayer = queue[front];
        front++;

        // reset the trackers to the first element of the array
        // when array is empty
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return  removedPlayer;
    }

    // access the front player
    public Player peek() {
        if (size() == 0) {
            throw  new NoSuchElementException();
        }

        return queue[front];
    }

    // get the number of elements in queue
    public int size() {
        return back - front;
    }

    // print all the elements of the queue
    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}