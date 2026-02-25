import java.util.Scanner;
public class details{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("name:");
      String name=sc.next();
      System.out.println("rollno");
      int rollno=sc.nextInt();
      System.out.println("age");
      int age=sc.nextInt();
      System.out.println("department");
      String department=sc.next();
      System.out.println("enter four subject marks");
      int mar1=sc.nextInt();
      int mar2=sc.nextInt();
      int mar3=sc.nextInt();
      int mar4=sc.nextInt();
            
      marks s1=new marks(name,rollno,age,department,mar1,mar2,mar3,mar4);
      s1.disp();
      s1.disp2();
      s1.calculate();
    } }
public class student{
    String name;
    int rollno;
    int age;
    String department;
    student(String a,int b,int c,String d)
    { name=a;
      rollno=b;
      age=c;
      department=d;
    } 
    public void disp(){
      System.out.println("name:"+name);
      System.out.println("rollno:"+rollno);
      System.out.println("age:"+age); 
      System.out.println("department:"+department);
    }

    class marks extends student{
        int mark1;
        int mark2;
        int mark3;
        int mark4;
        int tot;
        float avg;
        String res;
        marks(int m1,int m2,int m3,int m4){
        super(nm,rolno,age,department);
        mark1=m1;
        mark2=m2;
        mark3=m3;
        mark4=m4;
          
        { 
          System.out.println("student marks");
        } 
    }   
    
    public void calculate(){
      tot=mark1+mark2+mark3+mark4;
      avg=tot/4;
      if(mark1>40&&mark2>40&&mark3>40&&mark4>40){
        res="pass";
      }
      else{
        res="fail";
      }
    } 
    public void disp2(){
      System.out.println("mark1:"+mark1);
      System.out.println("mark2"+mark2);
      System.out.println("mark3"+mark3);
      System.out.println("mark4"+mark4);
      System.out.println("total:"+tot);
      System.out.println("average:"+avg);
      System.out.println("result:"+res);
    }
    }
}
    
    
      
       
        