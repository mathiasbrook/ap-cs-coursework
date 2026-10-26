//name: mathias
public class StreamMed {

   private static PQ<Integer> maxHeap =new PQ<Integer>(100);
   private static PQ<Integer> minHeap =new PQ<Integer>(100);

   public static void main(String[] args){
       Integer[] data ={5, 7, 0, 2, 1, 14, -3, 3, 0, 18, 20, 2};
       for (int i =0; i<data.length;i++) {
           addNumber(data[i]);
           System.out.println("Median of first "+(i + 1)+" elements");
           System.out.println(findMedian());
       }
   }

   public static void addNumber(int val) {
       // peek at max by popping and reinserting
       if (!maxHeap.isEmpty()) {
           int top =maxHeap.popMax();
           maxHeap.insert(top);
           if (val <=top)
               maxHeap.insert(val);
           else
               minHeap.insert(-val);
       } else {
           maxHeap.insert(val);
       }
        // rebalance
       if (maxHeap.size() >minHeap.size()+ 1) {
           minHeap.insert(-maxHeap.popMax());
       } else if (minHeap.size()>maxHeap.size()) {
           maxHeap.insert(-minHeap.popMax());
       }
   }

    public static double findMedian() {
       // peek by popping and reinserting
       int maxTop = maxHeap.popMax();
       maxHeap.insert(maxTop);
        if (maxHeap.size() == minHeap.size()) {
           int minTop = minHeap.popMax();
            minHeap.insert(minTop);
            return (double)(maxTop + (-minTop)) / 2;
        }else{
           return maxTop;
        }
    }
}
//Expected Output
//Median of first 1 elements
//5.0
//Median of first 2 elements
//6.0
//Median of first 3 elements
//5.0
//Median of first 4 elements
//3.5
//Median of first 5 elements
//2.0
//Median of first 6 elements
//3.5
//Median of first 7 elements
//2.0
//Median of first 8 elements
//2.5
//Median of first 9 elements
//2.0
//Median of first 10 elements
//2.5
//Median of first 11 elements
//3.0
//Median of first 12 elements
//2.5