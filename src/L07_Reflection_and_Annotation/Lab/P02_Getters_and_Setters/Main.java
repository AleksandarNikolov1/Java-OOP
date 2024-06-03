package L07_Reflection_and_Annotation.Lab.P02_Getters_and_Setters;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static class MethodsComparator implements Comparator<Method> {

        @Override
        public int compare(Method m1, Method m2) {
            int result = 0;

            if (m1.getName().compareTo(m2.getName()) > 0)
                result = 1;

            else if (m1.getName().compareTo(m2.getName()) < 0)
                result = -1;

            return result;
        }
    }

    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;
        Method[] methods = clazz.getDeclaredMethods();

        Set<Method> getters = new TreeSet<>(new MethodsComparator());
        Set<Method> setters = new TreeSet<>(new MethodsComparator());

        for (Method method : methods) {

            if (method.getName().startsWith("get")){
                getters.add(method);
            }

            else if (method.getName().startsWith("set")){
                setters.add(method);
            }
        }

        for (Method getter : getters) {
            System.out.printf("%s will return class %s%n", getter.getName(), getter.getReturnType().getName());
        }

        for (Method setter : setters) {
            System.out.printf("%s and will set field of class %s%n", setter.getName(),
                    setter.getParameterTypes()[0].getName());
        }
    }
}
