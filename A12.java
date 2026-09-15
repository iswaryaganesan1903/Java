import java.io.*;
import java.util.*;
class A12
{
public static void main(String []args)
{
System.out.println("Armstrong number");
Scanner ss=new Scanner(System.in);
int no = 100;
while(no<=999)
{
  int temp=no;
  int s=0;
  int n1=no;
  while(n1>0)
  {
   int r=n1%10;
   s=s+r*r*r;
   n1=n1/10;
  }
if(s==temp){
System.out.println(s);
}
no++;

}
}
}