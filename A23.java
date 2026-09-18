import java.io.*;
import java.util.*;
class A23
{
public static void main(String []args)
{
 Scanner s = new Scanner(System.in);
 int n = s.nextInt();
 int i = 2;
 while(i <= n)
 {
   System.out.print(i+" ");
   i = i*2+5;
 
 }
}
}
//2   9   23   51   107   



import java.io.*;
import java.util.*;
class A24
{
 public static void main(String []args)
 {
  Scanner s=new Scanner(System.in);
  int num = s.nextInt();
  int i = 4;
  int diff = 5;
  while(i<=num)
  {
   System.out.print(i+" ");
   i+=diff;
   diff*=2;
  }

 }
}

//4 9 19 39 79