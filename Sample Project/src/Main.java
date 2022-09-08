import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // prints out Hello World
        //System.out.println("Hello world!");

        // gets user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("hello" + name);

    }
}