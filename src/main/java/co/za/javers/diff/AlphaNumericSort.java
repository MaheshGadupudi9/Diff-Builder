package co.za.javers.diff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class AlphaNumericSort {
    public static void main(String[] args) {
        final HashSet<String> strings = new HashSet<>();
        strings.add("111");
        strings.add("A11");
        strings.add("VB11");
        strings.add("F11");
        strings.add("098");
        strings.add("123");

        System.out.println(strings);

        final Object[] objects = strings.toArray();

        Arrays.sort(objects);
        System.out.println(new ArrayList<>(Arrays.asList(objects)));

main3(null);
    }


    public static void main3(String[] args) {
        final Pattern p = Pattern.compile("^\\d+");
        String[] examples = { "111", "A11", "123", "VB11", "F11", "098","CD", "DE", "0A", "0B", "0C", "12", "0K", "TA", "0D", "01", "02", "11", "AB", "MN" };
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String object1, String object2) {
                Matcher m = p.matcher(object1);
                Integer number1 = null;
                if (!m.find()) {
                    Matcher m1 = p.matcher(object2);
                    if (m1.find()) {
                        return object2.compareTo(object1);
                    } else {
                        return object1.compareTo(object2);
                    }
                } else {
                    Integer number2 = null;
                    number1 = Integer.parseInt(m.group());
                    m = p.matcher(object2);
                    if (!m.find()) {
                        // return object1.compareTo(object2);
                        Matcher m1 = p.matcher(object1);
                        if (m1.find()) {
                            return object2.compareTo(object1);
                        } else {
                            return object1.compareTo(object2);
                        }
                    } else {
                        number2 = Integer.parseInt(m.group());
                        int comparison = number1.compareTo(number2);
                        if (comparison != 0) {
                            return comparison;
                        } else {
                            return object1.compareTo(object2);
                        }
                    }
                }
            }
        };
        List<String> examplesList = new ArrayList<String>(Arrays.asList(examples));
        Collections.sort(examplesList, c);
        System.out.println(examplesList);
    }
}
