package L08_Exceptions_and_Error_Handling.Lab.P01_Square_Root;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println(Math.sqrt(num));
        }
        catch (NumberFormatException ignored){
            System.out.println("Invalid number");
        }
        finally {
            System.out.println("Good bye");
        }
    }
}
