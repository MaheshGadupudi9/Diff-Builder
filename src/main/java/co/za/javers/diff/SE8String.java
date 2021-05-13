package co.za.javers.diff;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class SE8String {
    public static void main(String[] args) {
        System.out.println(Stream.of("green","yellow","blue").max((s1, s2)->s1.compareTo(s2)).filter(s->s.endsWith("n")).orElse("yellow"));


        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add(0,"3");
        strings.add(1,"4");
        strings.forEach(System.out::println);
    }
}
