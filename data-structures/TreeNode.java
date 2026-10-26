//Standard AP CS TreeNode class used by BST and TreeLab.
//This version stores Strings, which is what my BST and TreeLab use.
//The original was given to us in class and wasn't saved with my files, so this is a re-creation of it.
public class TreeNode
{
   private String value;
   private TreeNode left;
   private TreeNode right;

   public TreeNode(String initValue)
   {
      value = initValue;
      left = null;
      right = null;
   }

   public TreeNode(String initValue, TreeNode initLeft, TreeNode initRight)
   {
      value = initValue;
      left = initLeft;
      right = initRight;
   }

   public String getValue()
   {
      return value;
   }

   public TreeNode getLeft()
   {
      return left;
   }

   public TreeNode getRight()
   {
      return right;
   }

   public void setValue(String theNewValue)
   {
      value = theNewValue;
   }

   public void setLeft(TreeNode theNewLeft)
   {
      left = theNewLeft;
   }

   public void setRight(TreeNode theNewRight)
   {
      right = theNewRight;
   }
}
