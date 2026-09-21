import java.io.*;
import java.util.*;
class Products
{

    private int id,price,quantity,amount;
    private String name;
    private float rate,rate2;
    public void getDetails()
    {
       Scanner s = new Scanner(System.in);
        id = s.nextInt();
        name = s.next();
        price = s.nextInt();
        quantity = s.nextInt();
    }


    public void displayDetails()
    {
       System.out.println("Enter product ID:"+id);
       System.out.println("Enter product Name:"+name);
       System.out.println("Enter product Price:"+price);
       System.out.println("Enter product Quantity:"+quantity);
      
    }
    public int displayAmount()
    {
       amount = price * quantity;   
       return amount;
    }
    public float displayRate(int a,float b)
    {
       rate = a*b;
       return rate; 
    }
    public void displayResult(int x,float y)
    {
       rate2 = x*y;
       System.out.println("Rate is"+rate2); 
    }
}


class P1
{
  public static void main(String []args)
  {
     Products p = new Products();
     p.getDetails();
     p.displayDetails();
     int a = 2;
     float b = 105.50f;
     float answer = p.displayRate(a,b);
     System.out.println("display rate:"+answer);
     int result = p.displayAmount();
     p.displayResult(3,120.5f);
     System.out.println("Total pay:"+result);
  }

}