public class PQ<E extends Comparable<E>>
{
   private E[] pq;
   private int n = 0;

   public PQ(int maxN) {
      pq = (E[]) new Comparable[maxN + 1];
   }
   
   public boolean isEmpty() {
      return n == 0;
   }
   
   public int size() {
      return n;
   }
   
   public void insert(E e) {
      if (n < pq.length) {
         for (int i = 0; i < pq.length; i++) {
            if (pq[i] == null) {
               pq[i] = e;
               n++;
               break;
            }
            else if (e.compareTo(pq[i]) >= 0) {
               swim(i);
               pq[i] = e;
               n++;
               break;
            }
         }
      }
   }
   
   public E popMax() {
      E temp = pq[0];
      sink();
      n--;
      return temp;
   }
   
   private void swim(int i) {
      for (int j = n; j > i; j--) {
         pq[j] = pq[j - 1];
      }
      pq[i] = null;
   }
   
   private void sink() {
      for (int i = 0; i < n - 1; i++) {
         pq[i] = pq[i + 1];
      }
      pq[n - 1] = null;
   }
   
   private void exchange(int i, int j) {
      E temp = pq[i];
      pq[i] = pq[j];
      pq[j] = temp;
   }
   
   public void test() {
      for (E x : pq) {
         System.out.println(x);
      }
   }
   
   public static void main(String[] args) {
      PQ<Integer> test = new PQ<Integer>(9);

      for (int i = 0; i < 10; i++) {
         int temp = (int) (Math.random() * 100) + 1;
         //System.out.println(temp);
         test.insert(temp);
      }

      test.test();
      System.out.println("size: " + test.size());

      int[] tester = new int[test.size()];
      int sizer = test.size();

      for (int i = 0; i < sizer; i++) {
         tester[i] = test.popMax();
      }

      for (int x : tester) {
         System.out.println(x);
      }
   }
}