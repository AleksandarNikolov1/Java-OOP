package L04_Interfaces_and_Abstraction.Exercise.P05_Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        List<String> urls = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Smartphone phone = new Smartphone(numbers, urls);

        System.out.println(phone.call());
        System.out.println(phone.browse());

    }
}
