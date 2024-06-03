package L04_Interfaces_and_Abstraction.Exercise.P05_Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            if (url.matches(".*\\d.*")){
                sb.append("Invalid URL!").append(System.lineSeparator());
            }
            else
                sb.append("Browsing: ").append(url).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            if (number.matches(".*[a-zA-Z].*")){
                sb.append("Invalid number!").append(System.lineSeparator());
            }
            else
                sb.append("Calling... ").append(number).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
