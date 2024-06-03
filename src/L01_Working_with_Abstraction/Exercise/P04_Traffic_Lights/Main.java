package L01_Working_with_Abstraction.Exercise.P04_Traffic_Lights;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] trafficLights = sc.nextLine().split(" ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < trafficLights.length; j++) {
                if (trafficLights[j].equals("GREEN"))
                    trafficLights[j] = "YELLOW";

                else if (trafficLights[j].equals("YELLOW"))
                    trafficLights[j] = "RED";

                else
                    trafficLights[j] = "GREEN";
            }

            System.out.println(String.join(" ", Arrays.asList(trafficLights)));
        }
    }
}