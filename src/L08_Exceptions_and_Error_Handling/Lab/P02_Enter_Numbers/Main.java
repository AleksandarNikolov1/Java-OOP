package L08_Exceptions_and_Error_Handling.Lab.P02_Enter_Numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            try {
                int first = Integer.parseInt(sc.nextLine());
                int second = Integer.parseInt(sc.nextLine());

                checkInput(first, second);

                for (int i = first; i <= second; i++) {
                    System.out.print(i + " ");
                }

                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private static void checkInput(int start, int end) throws IllegalArgumentException {
        String errorMessage = null;

        if (start <= 1)
            errorMessage = "First number should be must be greater than 1";

        else if (start >= 100)
            errorMessage = "First number should be must be less than 100";

        else if (start >= end)
            errorMessage = "First number should be must be less than second number";

        if (end <= 1)
            errorMessage = "First number should be must be greater than 1";

        else if (end >= 100)
            errorMessage = "Second number should be must be less than 100";

        if (errorMessage != null)
            throw new IllegalArgumentException(errorMessage);
    }
}
