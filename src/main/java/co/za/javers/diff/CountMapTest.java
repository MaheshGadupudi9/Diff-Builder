package co.za.javers.diff;

import java.util.HashMap;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class CountMapTest {
    public static void main(String[] args) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
    Integer key =5;
    Integer value =key;
    countMap.put(key++, value);
    countMap.put(300, 300);

    int count=0;

        for (Integer i : countMap.keySet()) {
            for (Integer j : countMap.values()) {
                count++;
                if(i==countMap.get(i))break;
                else continue;
            }
        }

        System.out.println(count);
    }
}
