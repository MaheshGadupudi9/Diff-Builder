package co.za.javers.diff;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class StringTestiKm {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jupiter", "Neptune", "Mars", "Earth");

        Map<Integer, List<String>> integerListMap = list.stream().collect(Collectors.groupingBy(p -> p.length()));

        integerListMap.forEach((l,s)-> System.out.print(l+"="+s+" "));
        System.out.println();


        System.out.println(Thread.currentThread().getThreadGroup().getName());
    }
}
