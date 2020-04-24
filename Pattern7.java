import java.util.Scanner;
class Pattern7{
public static void main(String args[]){
int i,j,k,n;
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
  System.out.println();
}
}
}
