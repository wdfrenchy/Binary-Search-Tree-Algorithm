import java.util.*;

class BinarySearchTree {
    // Root of Binary Tree
    Node root;
    String s = "shesellseashells";

    // Constructors
    BinarySearchTree(int key) {
        root = new Node(key);
    }

    BinarySearchTree() {
        root = null;
    }

    public void insert(Node node, int data) {
        if (node.getLeft() == null) {
            Node temp = new Node(data);
            node.left = temp;
        }
        else if (node.getLeft().getData() > data) {
            insert(node.left, data);
        }
        else if (node.getRight() == null) {
            Node temp = new Node(data);
            node.right = temp;
        }
        else if (node.getRight().getData() < data) {
            insert(node.right, data);
        }
    }

    public boolean find(Node node, int value) {
        if (node.getLeft().getData() == value) {
            return true;
        }
        else if (node.getLeft().getData() > value) {
            find(node.left, value);
        }
        else if (node.getRight().getData() == value) {
            return true;
        }
        else if (node.getRight().getData() < value) {
            find(node.right, value);
        }
        return false;
    }

    public void showValues(Node node){
        int value = node.getData();
        if(node.getLeft() != null){
            System.out.println("Parent: " + value);
            System.out.println("Left " + node.getLeft().getData());
            showValues(node.left);
        }
        if(node.getRight() != null){
            System.out.println("Parent: " + value);
            System.out.println("Right " + node.getRight().getData());
            showValues(node.right);
        }
    }
}

BSTRunner.java
public class BSTRunner{
    // Driver program to test your function
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(4);
        Node n = tree.root;
        String s = "shesellsseashells";
        String no = "1100101110110101111010001100101101011";

        tree.insert(n, 2);
        tree.insert(n, 1);
        tree.insert(n, 3);
        tree.insert(n, 6);
        tree.insert(n, 5);

        tree.showValues(n);

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            System.out.print(bt.hash_map.get(currentChar) + " ");
        }
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
    }
}
