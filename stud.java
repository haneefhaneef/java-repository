import java.util.Scanner;
  public class stud{
    public static void main(String args[]){
   Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   int b=s.nextInt();
   int c=s.nextInt();
   int d=s.nextInt();
   int e=a+b+c+d;
   if(e>=90){
    System.out.println("a grade");
   }
   else if(e>=70){
     System.out.println("b grade");
   }
   else if(e>=60) {
     System.out.println("c grade");
   }
   else if(e>=50) {
      System.out.println("d grade");
   }
   else if(e>=40) {
     System.out.println("e grade");
   }
   else
     System.out.println("fail");
    }   
  }
     