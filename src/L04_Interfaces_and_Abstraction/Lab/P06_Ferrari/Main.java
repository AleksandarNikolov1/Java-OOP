package L04_Interfaces_and_Abstraction.Lab.P06_Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String driverName = sc.nextLine();

        Car ferrari = new Ferrari(driverName);

        System.out.println(ferrari.toString());
    }
}
