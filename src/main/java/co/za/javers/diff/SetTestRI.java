package co.za.javers.diff;

import java.util.LinkedHashSet;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class SetTestRI {
    public static void main(String[] args) {
//        Math.ab
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("3");
        set.add("1");
        set.add("3");
        set.removeIf(s->set.contains("1"));
        set.add("2");
        set.remove("2");

        set.forEach(s-> System.out.print(s+"-"));
    }
}
