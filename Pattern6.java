import java.util.Scanner;
class Pattern6
{
public static void main (String args[])
{
int i,j,n,k=1;
Scanner sc=new Scanner( System.in);
System.out.println("Enter number of rows");
n=sc.nextInt();
for(i=1;i<=n;i--)
{
for(j=1;j<+i;j++)
{
System.out.println(k++ +" ");
}
System.out.println();
}
}
}