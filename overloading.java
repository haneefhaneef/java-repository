public class overloading{
  void area(int s){
    System.out.println("area of square: "+(s*s));
  }
  public static void main (String args[]){
    overloading obj=new overloading();
    obj.area(5);

  }
}