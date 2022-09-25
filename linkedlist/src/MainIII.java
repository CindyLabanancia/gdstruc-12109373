// Java class that has contains() and indexOf() function

import java.util.LinkedList;

public class MainIII {
    public static void main(String[]args){
        // Instantiate the LinkedList class with Integer as a datatype
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // Use the linkedList.add() function to add elements with index.
        linkedList.add(0, 20);
        linkedList.add(1, 54);
        linkedList.add(2, 67);
        linkedList.add(3, 84);
        linkedList.add(4, 99);

        // Using the contains() function
        System.out.println("Does the List contains the number 84?: " + linkedList.contains(84));
        System.out.println("Does the List contains the number 21?: " + linkedList.contains(21));

        // Using the indexOf() function
        System.out.println("The number 84 is at the index of: " + linkedList.indexOf(84));
        System.out.println("The number 99 is at the index of: " + linkedList.indexOf(99));
    }
}
