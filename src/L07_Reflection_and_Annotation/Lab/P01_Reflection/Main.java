package L07_Reflection_and_Annotation.Lab.P01_Reflection;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Class<Reflection> baseClass = Reflection.class;

        System.out.println("class " + baseClass.getSimpleName());

        Class<? super Reflection> superClass = baseClass.getSuperclass();

        System.out.println("class " + superClass.getName());

        Class<?>[] interfaces = baseClass.getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Object reflection = baseClass.newInstance();
        System.out.println(reflection);
    }
}
