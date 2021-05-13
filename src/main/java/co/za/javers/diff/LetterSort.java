package co.za.javers.diff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class LetterSort {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("D", "B", "A", "C", "F", "G"));

//        letters.fil

        Predicate<String> p1= s -> s.compareTo("C")>0;
        Predicate<String> p2= s -> s.equals("B");

        letters.removeIf(p1.negate().or(p2));
        letters.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(letters);

    }
}
