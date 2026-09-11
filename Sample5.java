import java.io.*;
import java.util.*;
class Sample5
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Mark1");
int m1=s.nextInt();

System.out.println("Enter Mark2");
int m2=s.nextInt();

System.out.println("Enter Mark3");
int m3=s.nextInt();

float avg=(m1+m2+m3)/3.0f;
System.out.println("Average mark is "+avg);


}
}