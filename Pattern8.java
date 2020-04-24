import java.util.Scanner;
class Pattern8{
public static void main(String args[]){
int i,j,k,m,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of rows");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
  for(k=1;k<=n-i;k++)
   {
    System.out.print(" ");
   }
  for(j=1;j<=i;j++)
   {
   System.out.print(j+" ");
   }
   for(m=i-1;m>0;m--)
   {
   System.out.print(m+ " ");
   }
  System.out.println();
}
}
}
