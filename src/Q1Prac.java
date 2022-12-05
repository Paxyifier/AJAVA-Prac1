// Implement bounded types (implements an interface) with generics.
// .Create a Interface shape with method Area() create Circle and Square which implements Class Shape.
// Create a generic class BoundedShape that extends shape. And implement the generics and use area function accordingly
interface Shape{
    public Double getArea();
}
class BoundedShape <T extends Shape> {
    public Double <T> getArea(T shape) {
        return 0.0;
    }
}
class Circle implements Shape {
    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }
    private Double radius;
    @Override
    public Double getArea() {
        return radius*radius*Math.PI;
    }
}
class Square implements Shape {
    public Double getSide() {
        return side;
    }
    public void setSide(Double side) {
        this.side = side;
    }
    private Double side;
    @Override
    public Double getArea() {
        return side*side;
    }
}
public class Q1Prac {

}
