package L05_Polymorphism.Lab.P02_Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public Double getPerimeter() {
        return calculatePerimeter();
    }

    public Double getArea() {
        return calculateArea();
    }

    public abstract Double calculatePerimeter();
    public abstract Double calculateArea();
}
