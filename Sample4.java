import java.io.*;
import java.util.*;
class Sample4
{
public static void main(String []args)
{
Scanner a=new Scanner(System.in);

System.out.println("Enter what kind of tech you learn:");
String tech=a.nextLine();

System.out.println("when you do this");
String time=a.nextLine();

System.out.println("How did you learn");
String platform=a.nextLine();

System.out.println("Technology : " +tech);
System.out.println("Time Spent : " +time);
System.out.println("Platform : " +platform);



System.out.println("Enter principle:");
int p=a.nextInt();


System.out.println("Enter No.of.yr:");
int n=a.nextInt();

System.out.println("Enter Rate of interest:");
int r=a.nextInt();

float si=p*n*r/100.0f;

System.out.println("SI = " +si);

}
}