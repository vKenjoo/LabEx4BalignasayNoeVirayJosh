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

    public String computeLevels() {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            return sb.toString();
        }

        Queue<BTNode<T>> queue = new Queue<BTNode<T>>(100);
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            BTNode<T> curr = queue.dequeue();
            sb.append(curr.info).append(",");

            if (curr.left != null) {
                queue.enqueue(curr.left);
            }
            if (curr.right != null) {
                queue.enqueue(curr.right);
            }
        }
        return sb.toString();
    }
<<<<<<< HEAD

    public String toString()
    {
        if(root == null)
            return "Tree is null";
        else
            return "h = " + height + " " + root.toString();
=======
    
    public String toString(){
        return "h = " + height + " " + root.toString();
>>>>>>> f8989ecd62c0c2a1a7d5c28b3889fa60867bc342
    }
}