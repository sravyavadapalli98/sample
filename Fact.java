import java.util.Scanner;
class Fact
{
public static void main (String args[])
{
int i,j,f=1,n;
Scanner sc=new Scanner( System.in);
System.out.println("Enter any number");
n=sc.nextInt();
for(i=1;i<=n;i++)
f=f*i;
System.out.print("Factorial"+f);
}
}