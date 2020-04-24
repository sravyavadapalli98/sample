import java.util.Scanner;
class Fibonacci
{
public static void main (String args[])
{
int i,n,a=0,b=1,c;
Scanner sc=new Scanner( System.in);
System.out.println("Enter number of terms");
n=sc.nextInt();
for(i=1;i<=n-2;i++)
{
c=a+b;
System.out.println(", "+c);
a=b;
b=c
}
}
}