import GamePackage.Game;
import GamePackage.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Cindy");
        Game cardGame = new Game(player);
        cardGame.start();
    }
}