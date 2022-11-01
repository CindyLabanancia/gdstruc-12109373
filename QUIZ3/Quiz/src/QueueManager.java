import java.util.LinkedList;

public class QueueManager {

    private final LinkedList<Player> queue;

    public QueueManager() {
        this.queue = new LinkedList<>();
    }

    public void queue(Player player) {
        queue.push(player);
    }

    public int size() {
        return queue.size();
    }

    public Player dequeue() {
        return queue.pop();
    }

    public boolean canPopulateGame() {
        return queue.size() >= 5;
    }
}
