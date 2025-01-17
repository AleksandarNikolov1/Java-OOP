package L03_Inheritance.Lab.P04_Stack_Of_Strings;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class StackOfStrings{
    private ArrayList<String> data;

    public StackOfStrings() {
        data = new ArrayList<>();
    }


    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        return data.remove(data.size() - 1);
    }

    public String peek() {
        return data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
