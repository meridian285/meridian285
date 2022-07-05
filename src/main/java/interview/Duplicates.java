package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        Integer[]array = {1,2,64,23,56,78,34,123,78,89,23,67,90,43,345,345,234,34,12,43,54,23,24,13};
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(array));

        for (Integer v:set){
            int count = 0;
            for (Integer y:array){
                if (v==y){
                    count++;

                }
            }
            if (count>1){
                System.out.println(v+" "+count+ "times");
            }
        }
    }
}
