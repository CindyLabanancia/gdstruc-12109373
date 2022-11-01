import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player {
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    public static Player generatePlayer() {
        Random rand = new Random();
        String randomElement = getRandomPlayerNames().get(rand.nextInt(getRandomPlayerNames().size()));
        return new Player(randomElement);
    }

    public static List<String> getRandomPlayerNames() {
        return Arrays.asList(
                "unforgivenheat",
                "fightclubleia",
                "thegeneralleia",
                "pumbaathething",
                "wolverineyoda",
                "grantorinoyoda",
                "ikirumemento",
                "ranwoddyredneo",
                "incendiesran",
                "snatchranred"
                );
    }

}
