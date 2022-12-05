interface Shape{
    public Double getArea();
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
