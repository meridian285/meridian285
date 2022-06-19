package lesson14;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Green");
        System.out.println(colors);

        System.out.println(colors.contains("Red"));
        System.out.println(colors.contains("1"));

    }
}
