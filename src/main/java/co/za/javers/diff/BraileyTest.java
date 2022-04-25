package co.za.javers.diff;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class BraileyTest {

    static Map<String, String> map = new HashMap<>();

    static {
        map.put("A", "100000");
        map.put("B", "110000");
        map.put("C", "100100");
        map.put("D", "100110");
        map.put("E", "100010");
        map.put("F", "110100");
        map.put("G", "110110");
        map.put("H", "110010");
        map.put("I", "010100");
        map.put("J", "010110");
        map.put("K", "101000");
        map.put("L", "111000");
        map.put("M", "101100");
        map.put("N", "101110");
        map.put("O", "101010");
        map.put("P", "111100");
        map.put("Q", "111110");
        map.put("R", "111010");
        map.put("S", "011100");
        map.put("T", "011110");
        map.put("U", "101001");
        map.put("V", "111001");
        map.put("W", "010111");
        map.put("X", "101101");
        map.put("Y", "101111");
        map.put("Z", "101011");
    }

    public static void main(String[] args) {
         String ab = "abc";
        ab= ab.toUpperCase();
        StringBuilder output = new StringBuilder();
        for (char ch : ab.toCharArray()) {
            output.append(map.get("" + ch));
        }

        System.out.println(output);
    }
}
