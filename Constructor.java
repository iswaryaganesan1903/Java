import java.io.*;
class Const
{
     private int p,n;
     private float r,si;
     public Const()
     {
           p = 1000;
           n = 2;
           r = 2;
    
     }
     public Const(int x,float y)
     {
          p = x;
          n = 2;
          r = y;
     }
     public void calculation()
     {
          si=(p*n*r)/100;
          System.out.println(" SI = "+si);
     }
}
class Constructor
{
  public static void main(String []ags)
  {
     Const c1 = new Const();
     Const c2 = new Const(1500,2.5f);
     //c.initialize();
     c1.calculation();
     c2.calculation();
  }
}
