// Java class that that uses a variable that determines the elements present in the list

import java.util.LinkedList;

public class MainII {
    public static void main(String[]args){
        int linkedListSize = 0;

        // Instantiate the LinkedList class with Integer as a datatype
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // Use the linkedList.add() function to add elements with index.
        linkedList.add(0, 20);
        linkedList.add(1, 54);
        linkedList.add(2, 67);
        linkedList.add(3, 84);
        linkedList.add(4, 99);

        // Assign the value of linkedListSize
        linkedListSize = linkedList.size();

        System.out.println("The size of the Linked List is " + linkedListSize);
    }
}
