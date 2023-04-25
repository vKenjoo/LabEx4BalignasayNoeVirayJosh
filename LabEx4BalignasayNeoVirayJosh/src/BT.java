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
        else{
            height = -1;
            boolean hasChildNodes = true;

            while (hasChildNodes) {
                hasChildNodes = false;
                BTNode<T> currentNode = root;
                BTNode<T> leftMostNode = null;

                while (currentNode != null) {
                    if (currentNode.left != null) {
                        hasChildNodes = true;
                        if (leftMostNode == null) {
                            leftMostNode = currentNode.left;
                        }
                    }

                    if (currentNode.right != null) {
                        hasChildNodes = true;
                        if (leftMostNode == null) {
                            leftMostNode = currentNode.right;
                        }
                    }

                    currentNode = currentNode.left;
                }

                if (hasChildNodes) {
                    root = leftMostNode;
                }

                height++;
            }
        }
    }

    public String toString()
    {
        if(height == -1)
            return "Tree is empty";
        else
            return "ht = " + height + " " + root.toString();
    }
}