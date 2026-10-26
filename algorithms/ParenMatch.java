// name: Mathias Brook    date: 1/12/24

import java.util.*;
public class ParenMatch
{
   public static final String left  = "([{<";
   public static final String right = ")]}>";
   public static void main(String[] args)
   {
      System.out.println("Parentheses Match");
      ArrayList<String> parenExp = new ArrayList<String>();
      /* enter tests here */
      parenExp.add("5+7");
      parenExp.add("(5+7)");
      parenExp.add(")5+7(");
      parenExp.add("((5+7)*3)");
      parenExp.add("<{5+7}*3>");
      parenExp.add("[(5+7)*]3");
      parenExp.add("(5+7)*3");
      parenExp.add("5+(7*3)");
      parenExp.add("((5+7)*3");
      parenExp.add("[(5+7]*3)");
      parenExp.add("[(5+7)*3])");
      parenExp.add("([(5+7)*3]");
      
      for( String s : parenExp )
      {
         boolean good = checkParen(s);
         if(good)
            System.out.println(s + "\t good!");
         else
            System.out.println(s + "\t BAD");
      }
   }
   //Algorithm
   //Push the left grouping symbols on the stack
   //When a right grouping symbol is encountered
   //Pop the stack and compare the two symbols
   //They should match
   public static boolean checkParen(String exp)
   {
      JagStack<String> temp = new JagStack<String>();
      for (int i = 0; i < exp.length(); i++) {
         if (left.indexOf(exp.substring(i,i+1)) != -1) {
            temp.push(exp.substring(i,i+1));
         }
         else if (right.indexOf(exp.substring(i,i+1)) != -1) {
            if (temp.size() <= 0)
               return false;
            else if (left.indexOf(temp.pop()) != right.indexOf(exp.substring(i,i+1)))
               return false;
         }
      }
      return (temp.size() <= 0) ? true : false;
   }
}

/*
 Parentheses Match
 5+7	 good!
 (5+7)	 good!
 )5+7(	 BAD
 ((5+7)*3)	 good!
 <{5+7}*3>	 good!
 [(5+7)*]3	 good!
 (5+7)*3	 good!
 5+(7*3)	 good!
 ((5+7)*3	 BAD
 [(5+7]*3)	 BAD
 [(5+7)*3])	 BAD
 ([(5+7)*3]	 BAD
 */
