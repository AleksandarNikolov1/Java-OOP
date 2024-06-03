package L04_Interfaces_and_Abstraction.Exercise.P04_Food_Shortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Buyer> buyers = new ArrayList<>();

        while (n-- > 0) {
            String[] dataInfo = sc.nextLine().split("\\s+");

            if (dataInfo.length == 4) {
                buyers.add(new Citizen(dataInfo[0], Integer.parseInt(dataInfo[1]), dataInfo[2],
                        dataInfo[3]));
            } else {
                buyers.add(new Rebel(dataInfo[0], Integer.parseInt(dataInfo[1]),
                        dataInfo[2]));
            }
        }

        String input = sc.nextLine();


        while (!input.equals("End")) {

            String name = input;
            buyers.forEach(b -> {
                if (b.getName().equals(name)) {
                    b.buyFood();
                }
            });

            input = sc.nextLine();
        }

        int totalFood = buyers.stream().mapToInt(Buyer::getFood).sum();

        System.out.println(totalFood);
    }
}
