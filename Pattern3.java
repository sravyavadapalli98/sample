import java.util.Scanner;
class Pattern3
{
public static void main (String args[])
{
int i,j,n;
Scanner sc=new Scanner( System.in);
System.out.println("Enter number of rows");
n=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=n-i;j>0;j--)
{
System.out.print(j +" ");
}
System.out.println();
}
}
}