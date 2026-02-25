class area {
    double area(double side) {
        return side * side;
    }
    double area(double length, double breadth) {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
       area obj = new area();
        System.out.println("area of square"+obj.area(4));
        System.out.println("area of rectangle"+obj.area(4,6));
        
    }
}

   