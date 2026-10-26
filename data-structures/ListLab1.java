// Name:  Mathias Brook   
// Date:  11/17/21
import java.util.*;
public class ListLab1
{
   public static void main(String[] args)
   {
      ListNode head = new ListNode("hello", null);  //1st of 2nd segment
      head = new ListNode("foo", head);  //^ 
      head = new ListNode("boo", head);  //^
      head = new ListNode("nonsense", head); //^
      head = new ListNode("computer",  //V
         	new ListNode("science",  //V
         		new ListNode("java",  //V
         			new ListNode("coffee", head)  //V
         		)
         	)
         );
      print(head);
      print(head);
      
      /**** uncomment the code below for ListLab1 Extension  ****/
      
   	 System.out.println("First = " + first(head));
       System.out.println("Second = " + second(head));
       ListNode p = pointerToLast(head);
       System.out.println("Pointer to Last = " + p.getValue()+ " at " + p);
       ListNode c = copyOfLast(head);
       System.out.println("Copy of Last =    " + c.getValue()+ " at " + c);
   	 	
       Scanner in = new Scanner(System.in);
       System.out.print("Insert what? ");
       String x = in.next();
       head = insertFirst(head, x);
       head = insertLast(head, x);
       print(head);
   }
   public static void print(ListNode head)
   {
      System.out.print("[");
      while(head != null)
      {
         System.out.print(head.getValue());
         head = head.getNext();
         if(head != null)
            System.out.print(", ");
      }
      System.out.println("]");
   }
   
   // returns a new node that is a copy of the argument node.
   public static ListNode copyNode(ListNode arg)
   {
      if (arg == null) return null;
      ListNode copy = new ListNode(arg.getValue(), null);
      return copy;
   }
   
   // returns a new list that is a copy of the original list.
   // this method is recursive! 
   // example call:  ListNode head2 = copyList(head);
   public static ListNode copyList(ListNode arg)
   {		
      if (arg == null) return null;
      ListNode head = new ListNode(arg.getValue(), copyList(arg.getNext()));
      return head;  
   }
   //returns a new linked list containing copies of each node in //the original list except the first node, maintaining the //order of the original list.  It is not correct to just //return a pointer to the 2nd node of the original linked //list.  This method is recursive.
   public static ListNode rest(ListNode h) {
      h = h.getNext();
      ListNode copy = copyList(h);
      return copy;
   }
   // returns the value of the first node, or null if the list is empty 
   public static Object first(ListNode head) {
      if (head == null)
         return null;
      return head.getValue();
   }
   
   // returns the value of the second node, or null if the list is empty or if there is only one node.  // hint:  second could call the first of rest. 
   public static Object second(ListNode head) {
      if (head == null || head.getNext() == null)
         return null;
      return head.getNext().getValue();
   }
   //returns a reference to the last node in the list, or null if the list is empty.
   public static ListNode pointerToLast(ListNode head) {
      if (head == null) return null;
      ListNode tempHead = pointerToLast(head.getNext());
      if (tempHead == null)
         return head;
      else
         return pointerToLast(head.getNext());
   }
   //returns a copy of the last node (not just its value!).  copyofLast can be recursive.  
   public static ListNode copyOfLast(ListNode head) {
      if (head == null) return null;
      ListNode tempHead = copyOfLast(head.getNext());
      if (tempHead == null)
         return copyNode(head);
      else
         return copyOfLast(head.getNext());
   }
   //returns a reference to a list whose first node's value is specified by the argument, and the 
   //first node's next links to the original list. 
   public static ListNode insertFirst(ListNode head, Object arg) {
      head = new ListNode(arg,head);
      return head;
   }
   //returns a reference to a list whose last node's value is specified by the argument, such 
   //that this last node has been appended to the original list and had its next is set to null 
   public static ListNode insertLast(ListNode head, Object arg) {
      if (head == null)
         return new ListNode(arg,null);
      head = new ListNode(head.getValue(), insertLast(head.getNext(),arg));
      return head;  
   }  
      
}

/*****************************************
 
 [computer, science, java, coffee, nonsense, boo, foo, hello]
 [computer, science, java, coffee, nonsense, boo, foo, hello]
 First = computer
 Second = science
 Pointer to Last = hello at ListNode@18767ad
 Copy of Last =    hello at ListNode@a7bdcd
 Insert what? abc
 [abc, computer, science, java, coffee, nonsense, boo, foo, hello, abc]
 

  **********************************************/
