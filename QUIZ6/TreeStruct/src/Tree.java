public class Tree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void reverseTraverseInOrder() {
        if(root != null) {
            root.reverseTraverseInOrder();
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return  null;
    }

    public Node getMin(Node temp) {
        if(root == null) {
            return null;
        }
        Node leftMin, rightMin;
        Node min = temp;

        // recursive till find the minimum on the left
        if(temp.getLeftChild() != null) {
            leftMin = getMin(temp.getLeftChild());

            min = min(min, leftMin);
        }

        // recursive till find the minimum on the right
        if(temp.getRightChild() != null) {
            rightMin = getMin(temp.getRightChild());

            min = min(min, rightMin);
        }

        return min;
    }

    public Node getMax(Node temp) {
        if(root == null) {
            return null;
        }
        Node leftMax, rightMax;
        Node max = temp;

        // recursive till find the maximum on the left
        if(temp.getLeftChild() != null) {
            leftMax = getMax(temp.getLeftChild());

            max = max(max, leftMax);
        }

        // recursive till find the maximum on the right
        if(temp.getRightChild() != null) {
            rightMax = getMax(temp.getRightChild());

            max = max(max, rightMax);
        }

        return max;
    }

    private Node min(Node firstNode, Node secondNode) {
        if(firstNode.getData() <= secondNode.getData()) {
            return firstNode;
        }
        return secondNode;
    }

    private Node max(Node firstNode, Node secondNode) {
        if(firstNode.getData() >= secondNode.getData()) {
            return firstNode;
        }
        return secondNode;
    }

    public Node getRoot() {
        return root;
    }
}