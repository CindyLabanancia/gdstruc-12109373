import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Game> gameList = new ArrayList<>();
        QueueManager queueManager = new QueueManager();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while(countGamesStarted(gameList) < 10) {
            System.out.println("===========================");
            System.out.println("Games running: " + countGamesStarted(gameList) + " / 10");
            System.out.println("Players in queue: " + queueManager.size());
            if(!gameList.isEmpty()) {
                System.out.println("===========================");
                System.out.println("Games info:");
                for(int i = 0; i < gameList.size(); i++) {
                    System.out.println("Game " + (i+1) + " players : " + gameList.get(i).size() + " ,Started: " + gameList.get(i).isStarted());
                }
            }
            System.out.println("===========================");
            System.out.println("Press enter to start queueing players!");
            scanner.next();
            int randomPlayers = random.nextInt(7 - 1 + 1) + 1;
            System.out.println("Number of generated players: " + randomPlayers);
            for(int i = 0; i < randomPlayers; i++) {
                queueManager.queue(Player.generatePlayer());
            }
            Game game = getAnyAvailableGame(gameList);
            while(queueManager.canPopulateGame()) {
                for(int i = 0; i < 5; i++) {
                    if(game != null) {
                        game.addPlayer(queueManager.dequeue());
                    }
                }
            }
            gameList.add(game);
        }
    }

    public static boolean allGamesStarted(List<Game> list) {
        boolean result = !list.isEmpty();
        for(Game game : list) {
            if (!game.isStarted()) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int countGamesStarted(List<Game> list) {
        int i = 0;
        for(Game game : list) {
            if(game.isStarted()) {
                i+=1;
            }
        }
        return i;
    }

    public static Game getAnyAvailableGame(List<Game> list) {
        if(list.isEmpty()) {
            return new Game();
        }
        if(list.size() < 10 && allGamesStarted(list)) {
            return new Game();
        }
        for(Game game : list) {
            if(!game.isStarted()) {
                return game;
            }
        }
        return null;
    }
}