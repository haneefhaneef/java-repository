public class string{
  public static void main(String args[]){
    String s1="hello";
    System.out.println(s1);
    char firstChar = s1.charAt(0);
    System.out.println("First character (index 0): " + firstChar);
    String replacedString = s1.replace("o","a");
    System.out.println("after replacement:"+replacedString);
    String s2="hello";
    boolean result1 = s1.equals(s2);
    System.out.println("s1 equal to s2: " + result1);
    boolean result2 =s2.endsWith("o");
    System.out.println("after endswith method: "+result2);
    
  }
}