package L07_Reflection_and_Annotation.Exercise.P01_Harvesting_Fields.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Class<RichSoilLand> clazz = RichSoilLand.class;

        Field[] fields = clazz.getDeclaredFields();
        List<Field> selectedFields = new ArrayList<>();

        while (!input.equals("HARVEST")){

            switch (input){
                case "private":
                    selectedFields = getPrivateFields(fields);
                    break;
                case "protected":
                    selectedFields = getProtectedFields(fields);
                    break;
                case "public":
                    selectedFields = getPublicFields(fields);
                    break;
                case "all":
                    selectedFields = getAllFields(fields);
                    break;
            }

            for (Field field : selectedFields) {
                String modifier = getModifier(field);
                System.out.printf("%s %s %s%n", modifier, field.getType().getSimpleName(), field.getName());
            }

            input = sc.nextLine();


        }


    }

    private static List<Field> getPrivateFields(Field[] fields){
        List<Field> privateFields = new ArrayList<>();
        for (Field field : fields) {
            if (Modifier.isPrivate(field.getModifiers()))
                privateFields.add(field);
        }

        return privateFields;
    }

    private static List<Field> getProtectedFields(Field[] fields){
        List<Field> protectedFields = new ArrayList<>();
        for (Field field : fields) {
            if (Modifier.isProtected(field.getModifiers()))
                protectedFields.add(field);
        }

        return protectedFields;
    }

    private static List<Field> getPublicFields(Field[] fields){
        List<Field> publicFields = new ArrayList<>();
        for (Field field : fields) {
            if (Modifier.isPublic(field.getModifiers()))
                publicFields.add(field);
        }

        return publicFields;
    }

    private static List<Field> getAllFields(Field[] fields){
        List<Field> allFields = new ArrayList<>();
        Collections.addAll(allFields, fields);
        return allFields;
    }

    private static String getModifier(Field field){
        String modifier = "";

        if (Modifier.isPrivate(field.getModifiers()))
            modifier = "private";

        else if (Modifier.isProtected(field.getModifiers()))
            modifier = "protected";

        else if (Modifier.isPublic(field.getModifiers()))
            modifier = "public";

        return modifier;
    }
}
