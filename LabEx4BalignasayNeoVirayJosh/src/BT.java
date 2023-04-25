/*Balignasay, Neo Genesis
Viray, Josh Kenn
ICS2605
1CSF
Lab Exercise 4 */

public class BT<T> extends BTNode<T>
{
    BTNode<T> root;
    int height;

    public BT() 
    {
        root = null;
    }

    public void setRoot(BTNode<T> n)
    {
        root = n;
    }

    public int height(BTNode<T> node) 
    {
        if (node == null) 
        {
            height = 0;
        }
        else 
        {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            if (leftHeight > rightHeight) 
            {
                height = leftHeight + 1;
            }
            else 
            {
                height = rightHeight + 1;
            }
        }
        return height;
    }

    public String toString()
    {
        String toStringValue = "";
        toStringValue += "[";
        toStringValue += ("K = " + root.info.toString());
        if(left != null){
            toStringValue += " L = ";
            toStringValue += root.left.toString(); 
        }
        if(right != null){
            toStringValue += " R = ";
            toStringValue += root.right.toString();
        }
        toStringValue += "]";
        return toStringValue;
    }
}