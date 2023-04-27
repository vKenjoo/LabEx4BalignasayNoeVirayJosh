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

    public int countLeavesPostorder(BTNode<T> left) {
        if (left == null) {
            return 0;
        }
        int leftCount = countLeavesPostorder(left.left);
        int rightCount = countLeavesPostorder(left.right);
        if (left.left == null && left.right == null) {
            return 1 + leftCount + rightCount;
        } else {
            return leftCount + rightCount;
        }
    }
}