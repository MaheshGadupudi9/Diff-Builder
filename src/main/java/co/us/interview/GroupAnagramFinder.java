package co.us.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class GroupAnagramFinder {
    public static void main(String[] args) {
        String strs[] = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs).forEach(System.out::println);
    }

    public static List<List <String>> groupAnagrams(String[] strs) {
        ArrayList <List <String>> anagramsList = new ArrayList <>();
        for (int i = 0; i < strs.length; i++) {
            HashSet <String> angramSet = new HashSet <>();
            for (int j = i+1; j < strs.length; j++) {
                boolean anagram = isAnagram(strs[i], strs[j]);
                if (anagram)
                {
                   angramSet.add(strs[i]);
                   angramSet.add(strs[j]);
                }
            }
            //
            anagramsList.add(new ArrayList<>(angramSet));
        }
        return anagramsList;
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}
