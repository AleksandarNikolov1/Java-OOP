package L02_Encapsulation.Exercise.P01_Class_Box_Data_Validation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = Integer.parseInt(sc.nextLine());
        int w = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());

        Box box = new Box(l, w, h);

        System.out.printf("Surface Area - %.2f%n", box.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f%n", box.calculateSurfaceArea());
        System.out.printf("Volume - %.2f%n", box.calculateSurfaceArea());
    }
}
