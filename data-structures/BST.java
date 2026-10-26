public class BST{

   private TreeNode root;
  
   public BST(TreeNode r){
      root = r;
   }
   
   public String getRoot() {
      return (root != null) ? root.getValue() : "nothing";
   }
   
   //Use your insert method to construct a BST from the String.
   public BST(String str){
      String[] chars = str.replaceAll("\\s+","").split(""); //use split to put all of the strings characters into array or something
      root = new TreeNode(chars[0],null,null);
      for (String x: chars) {
         insert(x);
      }
   }
   
   //Search the tree to find the string. Return the empty String if the element is not found  
   public String find(String str){
      String[] chars = inOrder(root).split("");
      for (String x : chars)
         if (str.equals(x))
            return str;
     return "";
   }
    //return a String that is the Tree traversed in order  left,root,right
   public static String inOrder(TreeNode root){
      if (root==null) 
         return "";
      return inOrder(root.getLeft())+ root.getValue()+inOrder(root.getRight());
   }
   
   //Write a method to determine whether a String is in the tree
   //Return true if found
   //false if not
   public boolean search(String str){
      String[] chars = inOrder(root).split("");
      for (String x : chars)
         if (str.equals(x))
            return true;
     return false;
   }
   
   //Write a method to insert an element in the tree. Do not insert the element if it
   //is already in the tree
   //You can assume that str is a 1 character upper case string
   public void insert(String str){
   //greater > 0 less than < 0
      if (!search(str)) {
         TreeNode pointer = root;
         while (pointer != null) {
            if (str.compareTo(pointer.getValue()) > 0) {
               if (pointer.getRight() == null) {
                  pointer.setRight(new TreeNode(str, null, null));
                  return;
               }
               else
                  pointer = pointer.getRight(); //and then restart search loop
            }
            else if (str.compareTo(pointer.getValue()) < 0) {
               if (pointer.getLeft() == null) {
                  pointer.setLeft(new TreeNode(str, null, null));
                  return;
               }
               else
                  pointer = pointer.getLeft();
            }
         }
      }
   }
   
   //Write a method to remove and return the minimum element from the tree   
   public TreeNode removeMin(){
      if (root == null)
         return null;
      TreeNode pointer = root;
      while (pointer.getLeft() != null)
         pointer = pointer.getLeft();
      return remove(pointer.getValue());
   }
   
   
   //Write a method to remove and return the maximum element from the tree  
   public TreeNode removeMax(){
      if (root == null)
         return null;
      TreeNode pointer = root;
      if (pointer.getRight() != null)
         pointer = pointer.getRight();
      return remove(pointer.getValue());
   }
   
   //Write a method to remove an element in the tree.    
   //You can assume that str is a 1 character upper case string
   //This is really hard.  We will complete this one together 
   public TreeNode remove(String str){
      TreeNode removal = null;
      if (search(str)) {
         TreeNode pointer = root;
         TreeNode relativePointer = null;
         while (pointer != null) {
            if (str.compareTo(pointer.getValue()) > 0)
               pointer = pointer.getRight();
            else if (str.compareTo(pointer.getValue()) < 0)
               pointer = pointer.getLeft();
            if (pointer.getValue().equals(str)) {
               removal = new TreeNode(str,null,null);
                  relativePointer = pointer;
                  break;
            }
         }
         if (relativePointer.getRight() != null) {
            pointer = relativePointer.getRight();
            while (pointer.getLeft() != null)
               pointer = pointer.getLeft();
            relativePointer = new TreeNode(pointer.getValue(),relativePointer.getLeft(),relativePointer.getRight());
            if (pointer.getRight() != null)
               pointer = pointer.getRight();
            else
               pointer = null;
         }
         else
            relativePointer = relativePointer.getLeft();
      }
      return removal;
   }

   

     
   public static void main(String[] args){
      
      TreeNode D = new TreeNode("D",new TreeNode("A"),new TreeNode("E"));
      TreeNode F = new TreeNode("F",D,null);
      TreeNode G = new TreeNode("G",F,null);
      TreeNode K = new TreeNode("K",G,new TreeNode("L"));
      TreeNode P = new TreeNode("P",new TreeNode("O"),new TreeNode("Q"));
      TreeNode T = new TreeNode("T",new TreeNode("S"),new TreeNode("Z"));
      TreeNode R = new TreeNode("R",P,T);
      TreeNode M = new TreeNode("M",K,R);
      BST myBST = new BST(M);
      System.out.println(inOrder(M));
      System.out.println(myBST.search("N"));
      myBST.insert("N");
      System.out.println(myBST.search("N"));
      System.out.println(inOrder(M));
      myBST.insert("C");
      System.out.println(inOrder(M));
      myBST.insert("H");
      System.out.println(inOrder(M));
      myBST.insert("B");
      System.out.println(inOrder(M));
      myBST.insert("I");
      System.out.println(inOrder(M));
      BST myBST1 = new BST("MUSICAL");
      BST myBST2 = new BST("VALENTINES DAY");
      TreeNode Min= myBST2.removeMin();
      System.out.println(Min.getValue());
       TreeNode Max= myBST2.removeMax();
      System.out.println(Max.getValue());
      myBST2.remove("T");
      myBST2.remove("E");
   }
}