//Name: Mathias Brook

import java.util.Iterator;

public class JagStack<E> implements Iterable<E>{

   //Class variable
   
   private ListNode head;  //Class variable
   int size;
   //Creates a List with one value
   public JagStack(E e){
      head = new ListNode(e,null); 
      size++; 
   }
   
   //Creates an empty List where head is null
   public JagStack(){
      head=null;
   } 
   
   //Adds an element to the List
   public void push(E e){
       head =(new ListNode(e,head));
       size++;
   }
   
   public E peek() {
      return head.getValue();
   }
   
   public int size() {
      return size;
   }
   
   public boolean isEmpty() {
      return (size == 0);
   }
   
   public E pop() {
      E temp = head.getValue();
      size--;
      head = head.getNext();
      return temp;
   } 
   
   
   //Returns a String with all the elements of the Stack.  Uses the for-each loop
   //Commented out lines do not use for-each looop
   public String toString(){
      String ans="";
      for(E e:this)
         ans+=e + " ";
      return ans;
   }
   
   public MyIterator iterator(){
      return new MyIterator();  
   }
   private class MyIterator implements Iterator{//Class that iterates through the elements.  Allows the use of for each loop

      public boolean hasNext() {
         return (!isEmpty());
      }
      
      public E next() {
         E temp = null; 
         if (hasNext())
            temp = pop();
         return temp;
      }
   }   
      
   private class ListNode//Example of a private class. Notice all methods are public.
   {                     //This is just our regular ListNode class
      private E value;
      private ListNode next;
      public ListNode(E e, ListNode n)
      {
         value=e;
         next=n;
      }
      public ListNode(E e){
         value = e;
         next = null;
      }
        
      public E getValue()
      {
         return value;
      }
      public ListNode getNext()
      {
         return next;
      }
      public void setValue(E newv)
      {
         value=newv;
      }
      public void setNext(ListNode newn)
      {
         next=newn;
      }
      
   }
   
   
   public static void main(String[] args){
   
      JagStack<String> myList= new JagStack<String>("Snow");
      myList.push("Hello");
      myList.push("apple");
      myList.push("banana");
      myList.push("figs");
      System.out.println(myList);
      for (String s:myList)
         System.out.println(s);
     System.out.println(myList.size());
         
   
   }
}