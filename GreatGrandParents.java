class GreatGrandParents
{
  public void Family()
  {
   System.out.println("Great Grand Parents");
  }
}
class Grandparents
{
 public void Family1()
 { 
  System.out.println("Grandparents");
 }
}
class Father extends GreatGrandParents
{
 public void F()
 {
  System.out.println("Father");
 }
}
class Mother extends GrandParents
{
 public void M()
 {
  System.out.println("Mother");
 }
}
interface Father
{
 public void F();
}
interface Mother
{
 public void M();
}
class Me implements Father,Mother
{
public static void main(String args[])
  {

  System.out.println("Me");
  Father obj1=new Father();
  Mother obj2=new Mother();
  
  obj1.GreatGrandParents();
  obj1.Father();
  obj2.GrandParents();
  obj2.Mother();
  

  System.out.println("Me");
  
}
}
 
 