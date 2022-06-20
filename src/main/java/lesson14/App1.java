package lesson14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

//        System.out.println(capitals.get("China"));

        Map<Integer,String> colors = new HashMap<>();
        colors.put(0,"Red");
        colors.put(1,"Green");
        colors.put(2,"Red");
        colors.put(3,"Green");
//        System.out.println(colors.get(0));
//        System.out.println(colors);

//        Set<String> keys=capitals.keySet();
//        for (String country  : keys){
//            System.out.println(country);
//        }
//        for(String country : capitals.keySet()){
//            System.out.println(country);
//        }
//        Collection<String>  cities = capitals.values();
//        for (String city : cities) {
//            System.out.println(city);
//        }

//        for (String city : capitals.values()){
//            System.out.println(city);
//        }
        for (Map.Entry<String, String> pair : capitals.entrySet()){
            System.out.println(pair);
        }

    }
}
