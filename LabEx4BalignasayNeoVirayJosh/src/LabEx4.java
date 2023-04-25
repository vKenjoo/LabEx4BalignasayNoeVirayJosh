// Balignasay, Neo Genesis
// Viray, Josh Kenn
// ICS2605
// 1CSF
// Lab Exercise 4

import java.util.Scanner;

public class LabEx4{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Gocon, Marc Gyronne\nViray, Josh Kenn");
        System.out.print("Enter an integer t: ");
        int t = scanner.nextInt();

        if (t == 1) {
            // Build test trees t0, t1, and t2
            BTNode<Integer> node2 = new BTNode<>(2);
            BTNode<Integer> node4 = new BTNode<>(4);
            BTNode<Integer> node1 = new BTNode<>(1);
            BTNode<Integer> node5 = new BTNode<>(5);
            BTNode<Integer> node3 = new BTNode<>(3);

            BT<Integer> t0 = new BT<>();
            BT<Integer> t1 = new BT<>();
            BT<Integer> t2 = new BT<>();

            t1.setRoot(node3);
            node3.left = node1;
            node3.right = node5;
            node1.right = node2;
            node5.left = node4;

            // t2.setRoot(node6);
            // node6.left = node7;
            // node6.right = node8;
            // node7.left = node9;
            // node7.right = node10;
            // node8.right = node11;

            // Print trees
            System.out.println("Tree t0:");
            t0.computeLevels();
            System.out.println(t0);

            System.out.println("Tree t1:");
            t1.computeLevels();
            System.out.println(t1);

            System.out.println("Tree t2:");
            t2.computeLevels();
            System.out.println(t2);
        }
        if (t == 2){
            BST<String> bst1 = new BST<>();

            // Call insert for each of the following info values to insert them into bst1
            String[] infoValues = {"L", "C", "G", "K", "X", "H", "Q", "U", "W", "P", "M", "E"};
            for (String info : infoValues) {
                bst1.insert(info);
            }

            // Print bst1
            System.out.println("bst1: ");
            bst1.print();

            // Call search for each of the following info values in bst1
            String[] searchValues = {"A", "Q", "N", "L", "E", "C", "R"};
            for (String search : searchValues) {
                BTNode<String> foundNode = bst1.search(search);
                if (foundNode != null) {
                    // If found, print the node and its level
                    System.out.println("Node found: " + search + " Level: " + foundNode.level);
                    System.out.print(((Object) foundNode) );
                } else {
                    // If not found, print the searched info and say that it is not found
                    System.out.println("Node not found: " + search);
                }
            }
        }
    }
}