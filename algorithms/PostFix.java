import java.util.*;
import java.io.*;  

public class PostFix
{ 
   public static void main(String[] args) throws FileNotFoundException {
      Scanner inFile = new Scanner(new FileReader("postfix.txt"));
      ///Read in each line of the file and evaluate
      //You will write three evaluate methods
      //One which takes a String that evaluates the post fix expression String
      //One which takes two integers and a String which evaluates all two operand operators + - * / % ^
      //One which takes one integer which finds factorial !
      //Also write a helper method isOperator
      //You can use the String method split with " " as input to split the post fix expression into an array of Strings
      while (inFile.hasNext()){
         String str=inFile.nextLine();
         //Compare your output with the expected output below
         System.out.println(str+  "     " + evaluate(str));
      
         
      }
    
   }
   
   //Use your stack, not the Java stack
   //to evaluate the postfix expression
   public static int evaluate(String str){
      JagStack<Integer> equation = new JagStack<Integer>();
      for (String x: str.split(" ")) {
         if (isOperator(x)) {
               if (x.equals("!"))
                  equation.push(evaluate(equation.pop()));
               else
                  equation.push(evaluate(equation.pop(),equation.pop(),x));
         }
         else
            equation.push(Integer.valueOf(x));
      }
      return equation.pop();
   }
   
    //Finds the result of a op b 
   public static int evaluate(int a,int b,String op){
      switch(op) {
         case "+":
            return b + a;
         case "-":
            return b - a;
         case "*":
            return b * a;
         case "/":
            return b / a;
         case "%":
            return b % a;
         case "^":
            return (int)(Math.pow(b,a));
      }
      return 0;
   }
      
     //Finds a!
   public static int evaluate(int a){
      if (a > 1)
         return a * evaluate(--a);
      return 1;
   } 
       
     //Determines if str is an operator  
   public static boolean isOperator(String str){
      return ("+-*/%^!".indexOf(str) != -1) ? true : false;
   }
         
}

// Postfix  -->  Evaluate
//  3 4 5 * +		23
//  3 4 * 5 +		17
//  10 20 + -6 6 * +		-6
//  3 4 + 5 6 + *		77
//  3 4 5 + * 2 - 5 /		5
//  8 1 2 * + 9 3 / -		7
//  2 3 ^		8
//  20 3 %		2
//  21 3 %		0
//  22 3 %		1
//  23 3 %		2
//  5 !		120
//  1 1 1 1 1 + + + + !		120