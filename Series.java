import java.io.*;
class Series
{
public static void main(String []args)
{
int i=1;
while(i<=9)
{
if(i>=9){
System.out.print(i+" ");
i+=2;
}
else
{
i-=2;
System.out.print(i+" ");
}
}
}
}