public class stringbuffer{
  public static void main (String args[]){
    StringBuffer sb= new StringBuffer("hello");
    sb.append("world");
    System.out.println("after appending: "+sb);
    sb.insert(5,"java");
    System.out.println("after inserting: "+sb);
    sb.replace(6,10,"python");
    System.out.println("after replacing: "+sb);
  }
} 