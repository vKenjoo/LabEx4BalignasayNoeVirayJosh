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
        if (root == null) {
            height = -1;
        }
        else {
            
            height = 0;

            Queue<BTNode<T>> queue = new Queue<>(100);
            queue.enqueue(root);
        
            while (!queue.isEmpty()) {
                BTNode<T> currNode = queue.dequeue();
        
                if (currNode.left != null) {
                    queue.enqueue(currNode.left);
                }
        
                if (currNode.right != null) {
                    queue.enqueue(currNode.right);
                }
        
                if (queue.isEmpty()) {
                    height++;
                }
            }
        }
    }

    public String toString()
    {
        if(height == -1)
            return "ht=undefined (tree is empty.)";
        else
            return "ht=" + height + " " + root.toString();
    }
}