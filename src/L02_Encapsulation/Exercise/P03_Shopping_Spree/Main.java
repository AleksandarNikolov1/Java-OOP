package L02_Encapsulation.Exercise.P03_Shopping_Spree;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] peopleInfo = sc.nextLine().split(";");
        String[] productsInfo = sc.nextLine().split(";");

        Set<Person> people = new LinkedHashSet<>();
        Set<Product> products = new LinkedHashSet<>();

        for (String personInfo : peopleInfo) {
            String name = personInfo.split("=")[0];
            double money = Double.parseDouble(personInfo.split("=")[1]);
            people.add(new Person(name, money));
        }

        for (String productInfo : productsInfo) {
            String productName = productInfo.split("=")[0];
            double cost = Double.parseDouble(productInfo.split("=")[1]);
            products.add(new Product(productName, cost));
        }

        String input = sc.nextLine();

        while (!input.equals("END")){
            String[] tokens = input.split(" ");
            String personName = tokens[0];
            String productName = tokens[1];

            Person person = people.stream().filter(p -> p.getName().equals(personName))
                    .findFirst().orElseThrow();

            Product product = products.stream().filter(p -> p.getName().equals(productName))
                    .findFirst().orElseThrow();

            person.buyProduct(product);

            input = sc.nextLine();
        }

        for (Person person : people) {
            if (person.getProducts().isEmpty()){
                System.out.printf("%s – Nothing bought%n", person.getName());
            }

            else {

                StringBuilder productNames = new StringBuilder();

                for (Product product : person.getProducts()) {
                    productNames.append(product.getName()).append(", ");
                }

                productNames.setLength(productNames.length() - 2);

                System.out.printf("%s - %s%n", person.getName(), productNames.toString());
            }
        }


    }
}
