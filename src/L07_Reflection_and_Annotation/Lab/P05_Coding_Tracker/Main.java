package L07_Reflection_and_Annotation.Lab.P05_Coding_Tracker;

public class Main {

    @Author(name = "George")
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor(Main.class);
        Tracker.printMethodsByAuthor(Tracker.class);
    }
}
