import java.io.*;
import java.util.*;
class A11
{
public static void main(String []args)
{
System.out.println("Enter a number :");
Scanner ss=new Scanner(System.in);
int no=ss.nextInt();
int s =0;
int temp=no;
while(no>0)
{
 int r=no%10;
 s = s+r;
 if(no>9)
 {
  s=s*10;
 }
no=no/10;
}
if(s==temp)
{
 System.out.println("Palindrome number");
}
else
{
 System.out.println("not cd..cPalindrome number");

}

}
}