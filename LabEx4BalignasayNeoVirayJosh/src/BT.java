/*Balignasay, Neo Genesis
Viray, Josh Kenn
ICS2605
1CSF
Lab Exercise 4 */

public class BT<T> extends BTNode<T>{
    BTNode<T> root;
    int height = -1;

    public BT(){
        root = null;
    }

    public void setRoot(BTNode<T> n){
        root = n;
    }

    public void computeLevels() {
        if (root != null) 
        {
            height = 0;

            Queue<BTNode<T>> queue = new Queue<>(100);
            queue.enqueue(root);
        
            while (!queue.isEmpty()) {
                int nodesRemainingAtCurrentLevel = queue.size();

                while (nodesRemainingAtCurrentLevel > 0) 
                {
                    BTNode<T> current = queue.dequeue();

                    System.out.println("K=" +current.info + " level = " + height);
                    if (current.left != null) 
                    
                    {
                        queue.enqueue(current.left);
                    }
                    if (current.right != null) {
                        queue.enqueue(current.right);
                    }
                    nodesRemainingAtCurrentLevel--;
                }
                height++;
            }
        }
    }

    public String toString()
    {
        if(height == -1)
            return "ht = undefined (tree is empty.)";
        else
            return "ht=" + --height + " " + root.toString();
    }

    public static int countLeavesPostorder(BTNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countLeavesPostorder(root.left);
        int rightCount = countLeavesPostorder(root.right);
        if (root.left == null && root.right == null) {
            return 1 + leftCount + rightCount;
        } else {
            return leftCount + rightCount;
        }
    }

    public BTNode getNodeWithValue(BTNode root, String string) {
        if (root == null) {
            return null;
        }
        if (root.info.equals(string)) {
            return root;
        }
        BTNode leftResult = getNodeWithValue(root.left, string);
        if (leftResult != null) {
            return leftResult;
        }
        BTNode rightResult = getNodeWithValue(root.right, string);
        if (rightResult != null) {
            return rightResult;
        }
        return null;
    }
}