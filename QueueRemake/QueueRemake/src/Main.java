import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        Scanner scanner = new Scanner(System.in);

        println("== Queue System ==");
        println("== Type anything and hit enter to start ==");

        // while the count of the games started less than 10 continue the loop
        while(arrayQueue.getGameStartCounter() < 10) {
            scanner.next();
            Random random = new Random();
            int randomNumber = random.ints(1, 7)
                    .findFirst()
                    .orElse(1);


            println("Count of players that will join the queue: " + randomNumber);

            for(int i = 1; i <= randomNumber; i++) {
                arrayQueue.enqueue(randomPlayers().get(random.ints(0, randomPlayers().size())
                        .findFirst()
                        .orElse(0)));
            }

            println("== Game Started " + arrayQueue.getGameStartCounter() + " / 10");
            println("== Current Queue " + arrayQueue.size() + " / 5");
        }
    }


    private static void println(String toPrint) {
        System.out.println(toPrint);
    }

    private static List<Player> randomPlayers() {
        return Arrays.asList(
                generatePlayer("Goku"),
                generatePlayer("Broly"),
                generatePlayer("Vegeta"),
                generatePlayer("Luffy"),
                generatePlayer("Nami"),
                generatePlayer("Zoro"),
                generatePlayer("Sanji"),
                generatePlayer("Usopp"),
                generatePlayer("Chopper"),
                generatePlayer("Sakuragi"),
                generatePlayer("Rukawa"),
                generatePlayer("Diluc"),
                generatePlayer("Traveler"),
                generatePlayer("Tartaglia"),
                generatePlayer("Ei"),
                generatePlayer("Amber"),
                generatePlayer("Lisa"),
                generatePlayer("Paimon"),
                generatePlayer("Mihawk"),
                generatePlayer("Dracula"),
                generatePlayer("Paquito"),
                generatePlayer("Chou"),
                generatePlayer("Nasus"),
                generatePlayer("Sion"),
                generatePlayer("Jackson"),
                generatePlayer("Percy"),
                generatePlayer("Mark"),
                generatePlayer("Saul"),
                generatePlayer("Simon"),
                generatePlayer("Sinbad"),
                generatePlayer("Abe"),
                generatePlayer("Jong"),
                generatePlayer("Jonell"),
                generatePlayer("Lyla"),
                generatePlayer("Lilia"),
                generatePlayer("Badang"),
                generatePlayer("Hu Tao"),
                generatePlayer("Yelan"),
                generatePlayer("Raiden"),
                generatePlayer("Shogun"),
                generatePlayer("Wolf"),
                generatePlayer("Wix"),
                generatePlayer("Java"),
                generatePlayer("Python"),
                generatePlayer("Unity"),
                generatePlayer("Unreal"),
                generatePlayer("Johnson"),
                generatePlayer("Engine"),
                generatePlayer("Musk"),
                generatePlayer("Elon"),
                generatePlayer("Fatui")
        );
    }

    private static Player generatePlayer(String name) {
        return new Player(name, UUID.randomUUID());
    }
}