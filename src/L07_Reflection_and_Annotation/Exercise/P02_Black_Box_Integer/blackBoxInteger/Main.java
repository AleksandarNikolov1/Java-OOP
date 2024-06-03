package L07_Reflection_and_Annotation.Exercise.P02_Black_Box_Integer.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Scanner sc = new Scanner(System.in);

        Class<BlackBoxInt> clazz = BlackBoxInt.class;

        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        Method[] methods = clazz.getDeclaredMethods();

        Field innerValue = clazz.getDeclaredField("innerValue");
        innerValue.setAccessible(true);


        String input = sc.nextLine();

        while (!input.equals("END")){

            String methodName = input.split("_")[0];
            int parameter = Integer.parseInt(input.split("_")[1]);

            Method method = Arrays.stream(methods).filter(m -> m.getName().equals(methodName)).findFirst().orElse(null);

            if (method != null){
                method.setAccessible(true);
                method.invoke(blackBoxInt, parameter);
            }

            System.out.println(innerValue.getInt(blackBoxInt));

            input = sc.nextLine();
        }
    }
}
