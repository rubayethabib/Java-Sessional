class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

// Child Class Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
  @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Circle();
        Shape s3 = new Rectangle();

        s1.draw(); // generic shape
        s2.draw(); // draws circle
        s3.draw(); // draws rectangle
    }}

