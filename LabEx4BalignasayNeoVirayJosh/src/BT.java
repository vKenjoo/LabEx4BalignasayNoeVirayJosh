// Balignasay, Neo Genesis
// Viray, Josh Kenn
// ICS2605
// 1CSF
// Lab Exercise 4

public class BT<T> extends BTNode<T>{
    BTNode<T> root;
    int height = -1;

    //Constructor creating an empty binary tree
    public BT()
    {
        root = null;
    }

    //Setter for root of the tree
    public void setRoot(BTNode<T> n)
    {
        root = n;
    }

    // Computes the height of the tree; sets the height value of the tree
    public void computeLevels() 
    {
        if (root != null) 
        {
            height = 0;

            Queue<BTNode<T>> queue = new Queue<>(100);
            queue.enqueue(root);

            while (!queue.isEmpty()) 
            {
                int nodesRemainingAtCurrentLevel = queue.size();

                while (nodesRemainingAtCurrentLevel > 0) 
                {
                    BTNode<T> current = queue.dequeue();
                    System.out.println("K=" +current.info + " level = " + height);

                    if (current.left != null) 
                        queue.enqueue(current.left);
                    if (current.right != null) 
                        queue.enqueue(current.right);

                    nodesRemainingAtCurrentLevel--;
                }
                height++;
            }
        }
    }

    // Returns the string value of the tree
    public String toString()
    {
        if(height == -1)
            return "ht = undefined (tree is empty.)";
        else
            return "ht=" + --height + " " + root.toString();
    }

    public int countLeavesPostorder(BTNode<T> nodeRoot)
    {
        if (nodeRoot == null) 
            return 0;

        int currLeft = countLeavesPostorder(nodeRoot.left);
        int currRight = countLeavesPostorder(nodeRoot.right);

        if (nodeRoot.left == null && nodeRoot.right == null) 
            return currLeft + currRight + 1;
        else 
            return currLeft + currRight;
    }
}