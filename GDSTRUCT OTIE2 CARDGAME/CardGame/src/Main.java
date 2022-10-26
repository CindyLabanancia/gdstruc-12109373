import GamePackage.Game;
import GamePackage.Player;

public class Main {
    public static void main(String[] args) {
        String playerName = "Cindy";
        Player player = new Player(playerName);
        Game cardGame = new Game(player);
        cardGame.start();
    }
}