// Balignasay, Neo Genesis
// Viray, Josh Kenn
// ICS2605
// 1CSF
// Lab Exercise 4

public class BST<T extends Comparable<T>> extends BT<T> {

    // Method to insert a node with info k into the BST
    public void insert(T k) {
        if (root == null) {
            // If the tree is empty, set the root to the new node
            root = new BTNode<>(k);
            height = 1;
            return;
        }
        // Traverse the tree to find the appropriate insertion point for k
        BTNode<T> current = root;
        int level = 1;
        while (true) {
            if (k.compareTo(current.info) < 0) {
                if (current.left == null) {
                    // Insert a new node with info k to the left of the current node
                    current.left = new BTNode<>(k);
                    current.left.level = level + 1;
                    if (level + 1 > height) {
                        // If the height of the tree changes, update the height field
                        height = level + 1;
                    }
                    break;
                } else {
                    current = current.left;
                    level += 1;
                }
            } else if (k.compareTo(current.info) > 0) {
                if (current.right == null) {
                    // Insert a new node with info k to the right of the current node
                    current.right = new BTNode<>(k);
                    current.right.level = level + 1;
                    if (level + 1 > height) {
                        // If the height of the tree changes, update the height field
                        height = level + 1;
                    }
                    break;
                } else {
                    current = current.right;
                    level += 1;
                }
            } else {
                // If k already exists in the tree, do nothing
                break;
            }
        }
    }
    // Method to perform a BST search for info k and return the node that contains it
    public BTNode<T> search(T k) {
        BTNode<T> current = root;
        while (current != null) {
            if (k.compareTo(current.info) == 0) {
                // If the current node contains k, return the node
                return current;
            } else if (k.compareTo(current.info) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        // If k is not found in the tree, return null
        return null;
    }

    public void printSubtree(BTNode<String> node) {
        if (node != null) {
            // Print the left subtree
            printSubtree(node.getLeft());
            // Print the current node's data
            System.out.print(node.getData() + " ");
            // Print the right subtree
            printSubtree(node.getRight());
        }
    }
}