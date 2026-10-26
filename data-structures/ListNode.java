//Standard AP CS ListNode class used by ListLab1 and ListLabReverse.
//The original was given to us in class and wasn't saved with my files, so this is a re-creation of it.
public class ListNode
{
   private Object value;
   private ListNode next;

   public ListNode(Object initValue, ListNode initNext)
   {
      value = initValue;
      next = initNext;
   }

   public Object getValue()
   {
      return value;
   }

   public ListNode getNext()
   {
      return next;
   }

   public void setValue(Object theNewValue)
   {
      value = theNewValue;
   }

   public void setNext(ListNode theNewNext)
   {
      next = theNewNext;
   }
}
