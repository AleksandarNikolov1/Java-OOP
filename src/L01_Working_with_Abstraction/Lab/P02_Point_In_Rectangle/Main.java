package L01_Working_with_Abstraction.Lab.P02_Point_In_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rectangleCoordinates = readArray(sc);

        Point p1 = new Point(rectangleCoordinates[0], rectangleCoordinates[1]);
        Point p2 = new Point(rectangleCoordinates[2], rectangleCoordinates[3]);

        Rectangle rectangle = new Rectangle(p1, p2);

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0){
            int[] pointCoordinates = readArray(sc);
            int x = pointCoordinates[0];
            int y = pointCoordinates[1];

            Point point = new Point(x, y);

            System.out.println(rectangle.contains(point));
        }
    }

    private static int[] readArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
