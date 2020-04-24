import java.util.Scanner;
class Amstrong{
public static void main (String args[]){
int n,r,m,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
m=n;
while(n>0)
{
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(sum==m)
{
System.out.println("Amstrong number");
}
else
System.out.println("Not an Amstrong number");
}
}