//Name: Mathias Brook

import java.util.Iterator;

public class JagQueue<E> implements Iterable<E>{

   //Class variable
   
   private ListNode head;  //Class variable
   int size;
   //Creates a List with one value
   public JagQueue(E e){
      head = new ListNode(e,null); 
      size++; 
   }
   
   //Creates an empty List where head is null
   public JagQueue(){
      head=null;
   } 
   
   //Adds an element to the List
   public void add(E e){
       if (size() == 0) {
          head = new ListNode(e, null);
       }
       else {
         ListNode temp = head;
         while (temp.getNext() != null)
         temp = temp.getNext();
         temp.setNext(new ListNode(e, null));
       }
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
   
   public E poll() {
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
            temp = poll();
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
   
      JagQueue<String> myList= new JagQueue<String>("Snow");
      myList.add("Hello");
      myList.add("apple");
      myList.add("banana");
      myList.add("figs");
      System.out.println(myList);
      //for (String s:myList)
         //System.out.println(s);
     System.out.println(myList.size());
         
   
   }
}