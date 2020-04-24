import java.util.Scanner;
class Pattern4
{
public static void main (String args[])
{
int i,j,n;
Scanner sc=new Scanner( System.in);
System.out.println("Enter number of rows");
n=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=5;j>i;j--)
{
System.out.print(j +" ");
}
System.out.println();
}
}
}