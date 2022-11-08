public class Player {

    private final int id, position;
    private final String userName;

    public Player(int id, String userName, int position) {
        this.id = id;
        this.position = position;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public String getUserName() {
        return userName;
    }
}
