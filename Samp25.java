import java.io.*;
import java.util.*;
class Parent
{
    public int r,area2,area3,s;
    public float area1;
    public Parent()
    { 
         Scanner ss = new Scanner(System.in);
         System.out.println("Enter r value : ");
         r = ss.nextInt();
         System.out.println("Enter s value : ");
         s = ss.nextInt();
    }
    public float circle()
    {
          area1 = 3.14f*r*r;
          return area1;
    }
}

class Child1 extends Parent
{
    public int square()
    {
          area2 = r*r;
          return area2;
    }   
}

class Child2 extends Child1
{
     public int rectangle()
     {     
           area3 = r*s;
           return area3;
     }
}

class Samp25
{
     public static void main(String []args)
     {
           Child2 c = new Child2();
           float result1 = c.circle();
           System.out.println("Area of circle is : "+result1);
           int result2 = c.square();
           System.out.println("Area of square is : "+result2);
           int result3 = c.rectangle(); 
           System.out.println("Area of rectangle is : "+result3);  
     }
}