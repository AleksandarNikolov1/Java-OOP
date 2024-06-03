package L07_Reflection_and_Annotation.Lab.P05_Coding_Tracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tracker {
    @Author(name = "Peter")
    public static void printMethodsByAuthor(Class<?> clazz){
        Map<String, List<String>> methodsByAuthor = new HashMap<>();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            Author annotation = method.getAnnotation(Author.class);

            if (annotation != null){
                methodsByAuthor.putIfAbsent(annotation.name(), new ArrayList<>());
                methodsByAuthor.get(annotation.name()).add(method.getName() + "()");
            }
        }

        for (var entry : methodsByAuthor.entrySet()) {
            String allMethodsPerAuthor = entry.getValue().stream().map(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(entry.getKey() + ": " + allMethodsPerAuthor);
        }
    }
}
