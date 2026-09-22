import java.io.*;
import java.util.*;
class languages
{
    private String language,developer;
    private int year;
    public void getDetails()
    {
         System.out.println("Enter language,developer,introduced_year");
         Scanner s = new Scanner(System.in);
         language = s.next();
         developer = s.next();
         year = s.nextInt();

    }
    public void displayDetails()
    {
         System.out.println("Language : " +language+ "  Developer_name:"+developer+"  Introduced_year:"+year);
    }
    
}

class L1
{
 public static void main(String []args)
 {
     languages l1 = new languages();
     l1.getDetails();
     l1.displayDetails();
     languages l2 = new languages();
     l2.getDetails();
     l2.displayDetails();
 }
}