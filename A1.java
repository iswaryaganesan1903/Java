import java.io.*;
import java.util.*;
class A1
{
public static void main(String []args){
Scanner s = new Scanner(System.in);
System.out.println("Enter operation : ");
String math = s.nextLine();
System.out.println("Enter number1 : ");
int a = s.nextInt();
System.out.println("Enter number2 : ");
int b= s.nextInt();
int ans = 0;
switch(math){
   case "add": ans = a+b;
               break;
   case "sub": ans = a-b;
               break;
   case "mult": ans = a*b;
                break;
   case "div": ans = a/b;
               break;
   default : System.out.println("Invalid operation");
}
System.out.println("The answer is " +ans);
}
}