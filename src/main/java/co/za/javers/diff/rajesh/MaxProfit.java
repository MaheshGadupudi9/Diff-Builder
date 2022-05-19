package co.za.javers.diff.rajesh;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class MaxProfit {
    public int maxProfit(int n, String s, String q) {
        List<String> sStrings = findSubstring(s.toCharArray());
        List<String> qStrings = findSubstring(q.toCharArray());
        int profitMax = 0;
        for (int i = 0; i < s.length(); i++) {
            int profit = calcMaxProfit(sStrings.get(i).length(), sStrings.get(i), qStrings.get(i));
            profitMax = Math.max(profit, profitMax);
        }
        return profitMax;
    }

    private int calcMaxProfit(int length, String s, String q) {
        String x = xoring(s, q, length);
        int decimal = Integer.parseInt(x, 2);
        System.out.println(decimal);

        double profit = x.length() + 1 / Math.pow(2, decimal);
        return (int) Math.round(profit);
    }


    public List<String> findSubstring(char[] input) {
        int length = input.length;
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            StringBuilder str = new StringBuilder();
            str.append(input[i]);
            for (int j = i + 1; j <= length; j++) {
                if (j < length) {
                    str.append(input[j]);
                }
            }
            strings.add(str.toString());
        }
        return strings;

    }

    public String xoring(String a, String b, int n) {
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i))
                ans += "0";
            else
                ans += "1";
        }
        return ans;
    }
}
/*
1110

1110
111
11
110


* */