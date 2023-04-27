// Balignasay, Neo Genesis
// Viray, Josh Kenn
// ICS2605
// 1CSF
// Lab Exercise 4

public class BTNode<T>{
    // Constructors
    T info;
    int level;
    BTNode<T> left, right;

    public BTNode()
    {
        left = null;
        right = null;
        info = null;
    }

    public BTNode(T data)
    {
        left = null;
        right = null;
        info = data;
    }

    // toString
    public String toString()
    {
        String toStringValue = "";
        toStringValue += "[";
        toStringValue += ("K=" + info.toString());
        if(left != null)
        {
            toStringValue += " L=";
            toStringValue += left.toString(); 
        }
        if(right != null)
        {
            toStringValue += " R=";
            toStringValue += right.toString();
        }
        toStringValue += "]";
        return toStringValue;
    }

}