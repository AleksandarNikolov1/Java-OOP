package L07_Reflection_and_Annotation.Lab.P03_High_Quality_Mistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;

        Field[] fields = clazz.getDeclaredFields();

        Arrays.sort(fields, Comparator.comparing(Field::getName));

        for (Field field : fields) {
            if (!Modifier.isPrivate(field.getModifiers()))
                System.out.printf("%s must be private!%n", field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();

        Set<Method> getters = new TreeSet<>(Comparator.comparing(Method::getName));
        Set<Method> setters = new TreeSet<>(Comparator.comparing(Method::getName));

        for (Method method : methods) {
            if (method.getName().startsWith("get"))
                getters.add(method);

            else if (method.getName().startsWith("set"))
                setters.add(method);
        }

        for (Method getter : getters) {
            if (!Modifier.isPublic(getter.getModifiers()))
                System.out.printf("%s have to be public!%n", getter.getName());
        }

        for (Method setter : setters) {
            if (!Modifier.isPrivate(setter.getModifiers()))
                System.out.printf("%s have to be private!%n", setter.getName());
        }
    }
}
