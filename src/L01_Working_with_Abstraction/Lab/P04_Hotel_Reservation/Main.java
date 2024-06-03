package L01_Working_with_Abstraction.Lab.P04_Hotel_Reservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2].toUpperCase());
        DiscountType discountType = DiscountType.valueOf(input[3].toUpperCase());

        PriceCalculator calculator = new PriceCalculator(pricePerDay, days, season, discountType);

        System.out.printf("%.2f", calculator.calculate());
    }
}
