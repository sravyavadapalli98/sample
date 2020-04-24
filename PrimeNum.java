import java.util.Scanner;
class PrimeNum{
public static void main(String args[]){
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
n=sc.nextInt();
for(i=2;i<n/2;i++)
{
if(n%2==0)
{
System.out.println("not a prime");
System.exit(0);
}
}
System.out.println("prime no");
}
}
