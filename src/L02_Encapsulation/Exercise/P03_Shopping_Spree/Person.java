package L02_Encapsulation.Exercise.P03_Shopping_Spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");

        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0)
            throw new IllegalArgumentException("Money cannot be negative");

        this.money = money;
    }

    public void buyProduct(Product product) {
        if (product.getCost() <= this.money) {
            products.add(product);
            System.out.printf("%s bought %s%n", this.getName(), product.getName());
            this.money -= product.getCost();
        } else
            System.out.printf("%s can't afford %s%n", this.getName(), product.getName());

    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}
