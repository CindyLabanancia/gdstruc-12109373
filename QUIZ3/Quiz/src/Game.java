import java.util.LinkedList;

public class Game {

    private final int MAX_PLAYERS = 5;
    private final LinkedList<Player> players;
    private boolean started = false;

    public Game() {
        players = new LinkedList<>();
    }

    public void addPlayer(Player player) {
        if(isStarted()) return;
        if(players.size() == (MAX_PLAYERS - 1)) {
            players.push(player);
            startGame();
            return;
        }
        players.push(player);
    }

    public int size() {
        return players.size();
    }

    public void startGame() {
        started = true;
    }

    public boolean isStarted() {
        return started;
    }
}
