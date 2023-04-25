/*Balignasay, Neo Genesis
Viray, Josh Kenn
ICS2605
1CSF
Lab Exercise 4 */

public class BT<T> extends BTNode<T>{
    BTNode<T> root;
    int height = 0;

    public BT(){
        root = null;
    }

    public void setRoot(BTNode<T> n){
        root = n;
    }

    public void computeLevels() {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            height = 0;
        }

        Queue<BTNode<T>> queue = new Queue<BTNode<T>>(100);
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            BTNode<T> curr = queue.dequeue();
            height++;

            if (curr.left != null) {
                queue.enqueue(curr.left);
            }
            if (curr.right != null) {
                queue.enqueue(curr.right);
            }
        }
    }

    public String toString()
    {
        if(root == null)
            return "Tree is null";
        else
            return "ht = " + height + " " + root.toString();
    }
}