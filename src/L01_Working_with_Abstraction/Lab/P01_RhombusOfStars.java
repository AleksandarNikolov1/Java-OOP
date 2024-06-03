package L01_Working_with_Abstraction.Lab;

import java.util.Scanner;

public class P01_RhombusOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int stars = 1;
        int spaces = n - stars;

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < stars; col++) {
                System.out.print("* ");
            }

            spaces--;
            stars++;
            System.out.println();
        }

        spaces = 1;
        stars = n - spaces;

        for (int row = n; row < 2 * n; row++)
        {

            for (int col = 0; col < spaces; col++)
            {
                System.out.print(" ");
            }
            for (int col = 0; col < stars; col++)
            {
                System.out.print("* ");
            }
            spaces++;
            stars--;
            System.out.println();
        }
    }
}
