class BST<K extends Comparable<K>> extends BT<K> {
    // Insert method to add a new node with key k into the BST
    public void insert(K k) {
        BTNode<K> newNode = new BTNode<>(k); // Create a new node with key k
        int level = 0; // Initialize level as 0

        if (root == null) {
            // If the tree is empty, set newNode as the root and update height to 0
            root = newNode;
            height = 0;
        } else {
            BTNode<K> currentNode = root;
            BTNode<K> parent;

            // Traverse the tree to find the appropriate insertion point for k
            while (true) {
                parent = currentNode;
                int compare = k.compareTo(currentNode.info);
                level++;

                if (compare < 0) {
                    // If k is less than currentNode.info, move to the left child
                    currentNode = currentNode.left;
                    if (currentNode == null) {
                        // If left child is null, insert newNode as left child
                        parent.left = newNode;
                        break;
                    }
                } else if (compare > 0) {
                    // If k is greater than currentNode.info, move to the right child
                    currentNode = currentNode.right;
                    if (currentNode == null) {
                        // If right child is null, insert newNode as right child
                        parent.right = newNode;
                        break;
                    }
                } else {
                    // If k is equal to currentNode.info, do not insert duplicate key
                    return;
                }
            }
        }

        // Update the height field of the tree if the height changes
        if (level > height) {
            height = level;
        }
    }

    // Search method to find a node with key k in the BST
    public BTNode<K> search(K k) {
        BTNode<K> currentNode = root;

        // Traverse the tree to find the node with key k
        while (currentNode != null) {
            int compare = k.compareTo(currentNode.info);

            if (compare < 0) {
                // If k is less than currentNode.info, move to the left child
                currentNode = currentNode.left;
            } else if (compare > 0) {
                // If k is greater than currentNode.info, move to the right child
                currentNode = currentNode.right;
            } else {
                // If k is equal to currentNode.info, return the currentNode
                return currentNode;
            }
        }

        // If k is not found, return null
        return null;
    }

    public void print() {
    }
}
