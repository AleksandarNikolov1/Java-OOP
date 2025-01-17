package L05_Polymorphism.Lab.P02_Shapes;

public class Circle extends Shape{
    private final Double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
