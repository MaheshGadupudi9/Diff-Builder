package co.za.javers.diff;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class ListIKMTest {
    public static void main(String[] args) {
        List<Number> numbers = new LinkedList<>();

//        numbers.add(1+'');
        numbers.add(1);
        numbers.add(1F+2D);
//        numbers.add("12F".tr);

        System.out.println(numbers);
    }
}
