// Balignasay, Neo Genesis
// Viray, Josh Kenn
// ICS2605
// 1CSF
// Lab Exercise 4

public class Node<T> {
    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;
    public Node<T> right;
    public int level;
    public Node<T> left;
    public T info;

    // Constructors
    public Node(T data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }

    // Methods for setting and getting fields
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }
}
