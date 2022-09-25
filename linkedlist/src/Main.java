// Java class that removes the first element using LinkedList class

import java.util.LinkedList;

public class Main {

    public static void main(String[]args){
        // Instantiate the LinkedList class with Integer as a datatype
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // Use the linkedList.add() function to add elements with index.
        linkedList.add(0, 20);
        linkedList.add(1, 54);
        linkedList.add(2, 67);
        linkedList.add(3, 84);
        linkedList.add(4, 99);

        // Display the list before removing the first node
        System.out.println("List before removing the first node: " + linkedList);

        // Remove the first node using removeFirst() function
        linkedList.removeFirst();

        // Display the list after removing the first node
        System.out.println("List after removing the first node: " + linkedList);
    }
}