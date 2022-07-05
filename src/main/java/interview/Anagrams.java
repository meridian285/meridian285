package interview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String word1 = "Heart";
        String word2 = "Earth";

        boolean res = isAnagram(word1,word2);
        System.out.println(res);
    }

    private static boolean isAnagram(String word1, String word2) {
        if (word1.length()!=word2.length()) {
            return false;
        }
        String w1 = word1.toLowerCase();
        String w2 = word2.toLowerCase();

        char[] a1 = w1.toCharArray();
        char[] a2 = w2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        for (int i = 0; i<a1.length;i++){
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }

}
