// Implement bounded types (implements an interface) with generics.
// .Create a Interface shape with method Area() create Circle and Square which implements Class Shape.
// Create a generic class BoundedShape that extends shape. And implement the generics and use area function accordingly
interface Shape{
    Double getArea();
}
class Circle implements Shape {
    private final Double radius;
    public Circle (Double radius){
        this.radius =  radius;
    }
    @Override
    public Double getArea() {
        return radius*radius*Math.PI;
    }
}
class Square implements Shape {
    private final Double side;
    public Square (Number side){
        this.side = (Double) side;
    }
    @Override
    public Double getArea() {
        return side*side;
    }
}
public class Q1Prac <T extends  Shape> {
    T shape ;
    public Q1Prac(T shape){
         this.shape = shape;
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle(12.0);
        Shape shape2 = new Square(12.0);
        System.out.println("The area for circle with radius 12 is "+ shape1.getArea());
        System.out.println("The area for square with side 12 is "+ shape2.getArea());
    }
}
