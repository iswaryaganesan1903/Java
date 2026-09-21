import java.io.*;
import java.util.*;
class ReverseDegree
{
   public static void main(String []args)
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a word(only small letters):");
      String word = s.nextLine();
      int sum = 0;
      for(int i=0;i<word.length();i++)
      {
         char x = word.charAt(i);
         int y = (int)x;
         int a = 123-y;
         int b = i+1;
         int ans = a*b;
         sum = sum+ans;
           
      }
      System.out.println("Ans is"+sum);
      

   }
}