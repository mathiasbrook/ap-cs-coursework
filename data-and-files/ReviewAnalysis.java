//Name: Mathias Brook
import java.util.ArrayList;

public class ReviewAnalysis{
   private Review[] allReviews;

   public ReviewAnalysis(Review[] myReviews){
      allReviews = myReviews;
   }

   public double getAverageRating(){
      double sum = 0;
      for (Review x: allReviews) {
         sum += x.getRating();
      }
      return sum/allReviews.length;
    
   }
  
   public ArrayList<String> collectComments(){
      ArrayList<String> comments = new ArrayList<String>();
      for (int x = 0; x < allReviews.length; x++) {
         String review = x + "-";
         String comment = allReviews[x].getComment();
         for (int i = 0; i < comment.length(); i++) {
            if (comment.substring(i).startsWith("!")) {
               review += comment;
               if (!(review.endsWith(".") || review.endsWith("!"))) review += ".";
               comments.add(review);
            }
         }
      }
      return comments;
   }
   
   public static void main(String[] args){
      Review r0 = new Review(4,"Good! Thx");
      Review r1 = new Review(3,"OK site");
      Review r2 = new Review(5,"Great!");
      Review r3 = new Review(2,"Poor! Bad.");
      Review r4 = new Review(3,"");
      Review[] rAll = {r0,r1,r2,r3,r4};
      ReviewAnalysis reviews = new ReviewAnalysis(rAll);
      System.out.println("Expected 3.4 "+ reviews.getAverageRating());
      System.out.println(reviews.collectComments());
   }
}

