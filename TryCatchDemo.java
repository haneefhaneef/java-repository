class TryCatchDemo{
  public static void main (String args[]){
    try{ 
      int a=20;
      int b=30;
      int c=a/b;
      int arr[]=new int[3];
       arr[10]=30;
    }
    
    catch (ArithmeticException e){
      System.out.println("arithmetic error");
    }
    
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("ArrayIndexOutOfBoundsException");
    } 
    
   
   
} 
  }
