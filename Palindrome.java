import java.util.Scanner;
class Palindrome{
public static void main (String args[]){
int n,r,m,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
m=n;
while(n>0)
{
r=n%10;
rev=(rev*10)+r;
n=n/10;
}
if(rev==m)
{
System.out.println("palindrome");
}
else
System.out.println("Not palindrome");
}
}