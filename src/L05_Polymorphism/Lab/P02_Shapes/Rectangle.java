package L05_Polymorphism.Lab.P02_Shapes;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    private Double getHeight() {
        return height;
    }

    private Double getWidth() {
        return width;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * getHeight() + 2 * getWidth();
    }

    @Override
    public Double calculateArea() {
        return getHeight() * getWidth();
    }
}
