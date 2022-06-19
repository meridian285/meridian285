package lesson14;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
         Map<String,String> capitals = new HashMap<>();
         capitals.put("Chaina", "Beijing");
         capitals.put("India", "New Delhi");
         capitals.put("New Zealand", "Wellington");
         capitals.put("Canada", "Ottawa");
         capitals.put("Madagascar", "Antananarivu");
         capitals.put("England", "London");
         capitals.put("UK", "London");
         capitals.put("China", "Pekin");

        System.out.println(capitals.get("India"));

        Map<Integer,String> colors = new HashMap<>();
        colors.put(0,"Red");
        colors.put(1,"Green");
        colors.put(2,"Red");
        colors.put(3,"Green");
        System.out.println(colors.get(0));

    }
}
