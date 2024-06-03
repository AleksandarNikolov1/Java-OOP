package L01_Working_with_Abstraction.Lab.P02_Point_In_Rectangle;

public class Rectangle {
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean contains(Point point){
        if (point.getX() < p1.getX() || point.getX() > p2.getX())
            return false;

        else if (point.getY() < p1.getY() || point.getY() > p2.getY())
            return false;

        return true;
    }


}
