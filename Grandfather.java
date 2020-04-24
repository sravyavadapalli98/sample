class Grandfather
{
   public void Grandfather()
   {
     System.out.println("Grandfather");
   }
}
class Mother extends Grandfather
{
public void Mother()
{
System.out.println("Mother");
}
}
class Son extends Mother
{
   public void Son()
   {
     System.out.println("Son");
   }
   public static void main(String args[])
   {
     Son obj = new Son();
     obj.Grandfather(); //calling grand parent class method
     obj.Mother(); //calling parent class method
     obj.Son(); //calling local method
  }
}