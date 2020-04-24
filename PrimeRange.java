import java.util.Scanner;
class PrimeRange{
public static void main(String args[]){
int min,max,i,j,counter;
Scanner sc=new Scanner(System.in);
System.out.println("enter any range");
max=sc.nextInt();
min=sc.nextInt();
for(i=min;i<=max;i++)
{
counter=0;
 for(j=2;j<=i/2;j++)
  {
   if(i%j==0)
    {
    counter=1;
    break;
    }
   if(counter==0)
    {
    System.out.println("i");
}
}
}
}
}