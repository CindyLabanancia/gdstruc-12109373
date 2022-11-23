public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        // traverse the tree (in-order)
        //tree.traverseInOrder();
        Node max = tree.getMax(tree.getRoot());
        Node min = tree.getMin(tree.getRoot());

        // Get the maximum value on the tree
        System.out.println("Maximum value: " + ((max != null) ? max.getData() : "Empty tree!"));

        // Get the minimum value on the tree
        System.out.println("Minimum value: " + ((min != null) ? min.getData() : "Empty tree!"));

        System.out.println();
        System.out.println("================");
        System.out.println();
        System.out.println("Print in traverse in-order descending order");
        System.out.println();
        tree.reverseTraverseInOrder();

    }
}