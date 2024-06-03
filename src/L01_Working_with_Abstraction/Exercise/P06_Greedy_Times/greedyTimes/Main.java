package L01_Working_with_Abstraction.Exercise.P06_Greedy_Times.greedyTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] vaultItems = scanner.nextLine().split("\\s+");

        Map<String, TreeMap<String, Long>> bag = new LinkedHashMap<>();
        bag.put("Gold", new TreeMap<>());
        bag.put("Gem", new TreeMap<>());
        bag.put("Cash", new TreeMap<>());

        long gold = 0;
        long gem = 0;
        long cash = 0;

        long total = 0;

        for (int i = 0; i < vaultItems.length; i += 2) {
            String name = vaultItems[i];
            long count = Long.parseLong(vaultItems[i + 1]);


            if (name.toLowerCase().equals("gold")) {
                gold += count;


                if (total + count <= bagCapacity) {
                    bag.get("Gold").putIfAbsent(name, (long) 0);
                    bag.get("Gold").put(name, bag.get("Gold").get(name) + count);
                    total += count;
                }

            } else if (name.toLowerCase().endsWith("gem")) {
                gem += count;

                if (gem > gold)
                    gem -= count;

                else {
                    if (total + count <= bagCapacity) {
                        bag.get("Gem").put(name, count);
                        total += count;
                    }
                }
            } else if (name.length() == 3) {
                cash += count;

                if (cash > gem)
                    cash -= count;

                else {
                    if (total + count <= bagCapacity) {
                        bag.get("Cash").put(name, count);
                        total += count;
                    }
                }
            }
        }


        for (Map.Entry<String, TreeMap<String, Long>> entry : bag.entrySet()) {
            long[] totalAmountPerItem = new long[1];
            entry.getValue().forEach((key, value) -> totalAmountPerItem[0] += value);

            if (totalAmountPerItem[0] != 0)
                System.out.printf("<%s> $%d%n", entry.getKey(), totalAmountPerItem[0]);

            entry.getValue().entrySet().stream().sorted((item1, item2) -> item2.getKey().compareTo(item1.getKey()))
                    .forEach(item -> System.out.printf("##%s - %d%n", item.getKey(), item.getValue()));

        }
    }
}