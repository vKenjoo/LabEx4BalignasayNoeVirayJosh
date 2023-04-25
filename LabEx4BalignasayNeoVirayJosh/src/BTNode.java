/*Balignasay, Neo Genesis
Viray, Josh Kenn
ICS2605
1CSF
Lab Exercise 4 */

public class BTNode<T>{
    // Constructors
    T info;
    int level;
    BTNode<T> left, right;

    public BTNode(){
        left = null;
        right = null;
        info = null;
    }

    public BTNode(T data){
        left = null;
        right = null;
        info = data;
    }

    public BTNode(T data, BTNode<T> leftChild, BTNode<T> rightChild){
        left = leftChild;
        right = rightChild;
        info = data;
    }
    //Debug Setters and getters

    public T getData() {
        return info;
    }

    public void setData(T data) {
        this.info = data;
    }

    public BTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BTNode<T> left) {
        this.left = left;
    }

    public BTNode<T> getRight() {
        return right;
    }

    public void setRight(BTNode<T> right) {
        this.right = right;
    }

    // toString
    public String toString(){
        String toStringValue = "";
        toStringValue += "[";
        toStringValue += ("K = " + info.toString());
        if(left != null){
            toStringValue += " L = ";
            toStringValue += left.toString(); 
        }
        if(right != null){
            toStringValue += " R = ";
            toStringValue += right.toString();
        }
        toStringValue += "]";
        return toStringValue;
    }
}