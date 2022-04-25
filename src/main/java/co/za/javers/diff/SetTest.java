package co.za.javers.diff;

import java.util.LinkedHashSet;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class SetTest {
    public static void main(String[] args) {
//        Math.ab
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("3");
        set.add("1");
        set.add("3");
        set.add("2");
        set.add("3");
        set.add("1");

        set.forEach(s-> System.out.print(s+"-"));
    }
}
