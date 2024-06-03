package L03_Inheritance.Exercise.P06_Animals.animals;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String animalType = sc.nextLine();
        String[] animalData = sc.nextLine().split("\\s+");


        while (!animalType.equals("Beast!")){

            String name = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            String gender = animalData[2];

            try{
                switch (animalType){
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat.toString());
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog.toString());
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog.toString());
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten.toString());
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat.toString());
                        break;
                }
            }

            catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }

            animalType = sc.nextLine();
            animalData = sc.nextLine().split("\\s+");
        }
    }
}
