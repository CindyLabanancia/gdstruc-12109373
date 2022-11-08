public class Main {
    public static void main(String[] args) {
        Player pikachu = new Player(25, "Pikachu", 1);
        Player celebi = new Player(251, "Celebi", 2);
        Player hitmonchan = new Player(107, "Hitmonchan", 3);
        Player mankey = new Player(56, "Mankey", 4);
        Player starmie = new Player(175, "Starmie", 4);

        SimpleHashtable hashtable = new SimpleHashtable();

        // add initial players
        hashtable.put(celebi.getUserName(), celebi);
        hashtable.put(mankey.getUserName(), mankey);
        hashtable.put(pikachu.getUserName(), pikachu);
        hashtable.put(hitmonchan.getUserName(), hitmonchan);
        hashtable.put(starmie.getUserName(), starmie);

        // print the contents of the hashtable
        hashtable.printHashtable();

        // get a value based on a given key

        // print mankey first and then remove
        System.out.println(hashtable.get("Mankey").getUserName());
        hashtable.removeKey("Mankey");
        if(hashtable.get("Mankey") == null) {
            System.out.println("Not found");
        }
    }
}