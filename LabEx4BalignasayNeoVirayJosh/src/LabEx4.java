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
    }
}