public class BT<T>
{
    BTNode<T> root;
    int height;

    public BT() {
        root = null;
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

}
