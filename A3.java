import java.io.*;
import java.util.*;
class A3
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter valid Mail id:");
String mail=s.nextLine();
System.out.println("Enter phone number:");
String number=s.nextLine();
if(mail.equals("admin@123") && number.equals("1234567890"))
{
   System.out.println("Enter name:");
   String name=s.nextLine();
   System.out.println("Enter password:");
   String pass=s.nextLine();
   if(name.equals("Iswarya") && pass.equals("iswarya123"))
  {
   System.out.println("Verified successful.go to home page. ");
  }
  else{
  System.out.println("Not valid");
  }
}
  else{
  System.out.println("Not valid");
  }

}
}