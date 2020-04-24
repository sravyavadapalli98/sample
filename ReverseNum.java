import java.util.Scanner;
class ReverseNum{
public static void main (String args[]){
int n,r,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
while(n>0)
{
r=n%10;
rev=(rev*10)+r;
n=n/10;
}
System.out.println("Reverse number"+rev);
}
}