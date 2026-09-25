import java.io.*;
class Parent
{
    public int a,b,c,d;
    public void initialize()
    {
         a = 200;
         b = 5;
    }
    public void multiplication()
    {
         c = a*b;
         System.out.println("Multiplication: "+c);
    }
}
class Child1 extends Parent
{

     public void division()
     {
         d = a/b;
         System.out.println("Division: "+d);
     }
}

class Sample25
{
    public static void main(String []args)
    {
         Child1 c1 = new Child1();
         c1.initialize();
         c1.multiplication();
         c1.division();
    }
}