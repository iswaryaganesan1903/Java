import java.io.*;
import java.util.*;
class A4
{
public static void main(String []args)
{
System.out.println("Booking tickets to go native");
Scanner s=new Scanner(System.in);
System.out.println("Enter bus ticket rate :");
int amount = s.nextInt();
System.out.println("Enter available seat single seat or double seat :");
String seat = s.next();
if(amount<=1000 && seat.equals("single seat")){
     System.out.println("Booking tickets on bus");
}
else
{
    System.out.println("Booking tickets on train");
}

}
}