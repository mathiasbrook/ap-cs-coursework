import java.util.Iterator;

public class JAGArrayList<E> implements Iterable<E> {

   private E[] array;
   private int size;

   public JAGArrayList(int num) {
      array = (E[]) new Object[num];
   }

   public JAGArrayList() {
      array = (E[]) new Object[10];
   }

   public int size() {
      return size;
   }

   public boolean add(E obj) {
      if (size + 1 > array.length)
         doubleArray();
      array[size] = obj;
      size++;
      return true;
   }

   public void add(int index, E obj) {
      if (index > size || index < 0)
         throw new IndexOutOfBoundsException();
      if (size + 1 > array.length)
         doubleArray();
      for (int j = size; j > index; j--)
         array[j] = array[j - 1];
      array[index] = obj;
      size++;
   }

   public E get(int index) {
      if (index >= size || index < 0)
         throw new IndexOutOfBoundsException();
      return array[index];
   }

   public E set(int index, E obj) {
      if (index >= size || index < 0)
         throw new IndexOutOfBoundsException();
      E temp = array[index];
      array[index] = obj;
      return temp;
   }

   public E remove(int index) {
      if (index >= size || index < 0)
         throw new IndexOutOfBoundsException();
      E temp = array[index];
      for (int j = index; j < size - 1; j++)
         array[j] = array[j + 1];
      size--;
      array[size] = null;
      if (size < array.length / 4)
         halveArray();
      return temp;
   }

   public boolean contains(E obj) {
      for (int i = 0; i < size; i++) {
         if (obj == null) {
            if (array[i] == null)
               return true;
         } else if (obj.equals(array[i])) {
            return true;
         }
      }
      return false;
   }

   public String toString() {
      String ans = "";
      for (E e : this)
         ans += e + " ";
      return ans;
   }

   public Iterator<E> iterator() {
      return new ArrayIterator();
   }

   private void doubleArray() {
      E[] temp = (E[]) new Object[array.length * 2];
      for (int i = 0; i < size; i++)
         temp[i] = array[i];
      array = temp;
   }

   private void halveArray() {
      E[] temp = (E[]) new Object[array.length / 2];
      for (int i = 0; i < size; i++)
         temp[i] = array[i];
      array = temp;
   }

   private class ArrayIterator implements Iterator<E> {
      private int index = 0;

      public boolean hasNext() {
         return index < size;
      }

      public E next() {
         if (!hasNext())
            return null;
         return array[index++];
      }
   }

   public static void main(String[] args) {
      JAGArrayList<Integer> list = new JAGArrayList<>();
      for (int i = 0; i < 10; i++)
         list.add(i);
      System.out.println(list + "Size: " + list.size());

      list.remove(3);
      System.out.println(list + "Size: " + list.size());

      list.add(2, 7);
      System.out.println(list + "Size: " + list.size());

      list.add(4);
      System.out.println(list + "Size: " + list.size());

      list.remove(0);
      System.out.println(list + "Size: " + list.size());

      System.out.println("Contains 11: " + list.contains(11));
      System.out.println("Contains 7: " + list.contains(7));
   }
}
