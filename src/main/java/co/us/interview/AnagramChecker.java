package co.us.interview;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramChecker {
    public static void main(String[] args) {

        System.out.println((0-'a'));

        LocalTime start = LocalTime.now();
//        System.out.println("isAnagram(anagram,nagaram) = " + isAnagram("anagram", "nagaram"));
//        System.out.println("isAnagram(anagram,nagaram) = " + isAnagramUsingMap("anagram", "nagaram"));
        System.out.println("isAnagram(anagram,nagaram) = " + isAnagramUsingArrays("anagram", "nagaram"));
        LocalTime end = LocalTime.now();

        System.out.println(ChronoUnit.MILLIS.between(start, end));

//        System.out.println("isAnagram(anagram,naGaram) = " + isAnagram("anagram", "naGaram"));

//        System.out.println("\"args\".equalsIgnoreCase(\"Args\") = " + "args".equalsIgnoreCase("Args"));
    }
/*
Check if the both strings are using same characters, but order is not important.
anagram    nagaram */

    /*
     * sort the both arrays
     * convert to string
     * and compare
     * */
    /*
     * sort the both arrays
     * convert to string
     * and compare
     * */

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }

    public static boolean isAnagramUsingMap(String s, String t) {
        HashMap <Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }

    public static boolean isAnagramUsingArrays(String s, String t) {
        int[] charactersT = new int[26];
        for(int i=0;i<t.length();i++){
            charactersT[t.charAt(i)-'a'] = charactersT[t.charAt(i)-'a'] + 1;
        }
        int[] charactersS = new int[26];
        for(int i=0;i<s.length();i++){
            charactersS[s.charAt(i)-'a'] = charactersS[s.charAt(i)-'a'] + 1;
        }
        for(int i=0;i<charactersT.length;i++){
            if(charactersT[i]!=charactersS[i]){
                return false;
            }
        }
        return true;
    }
}
