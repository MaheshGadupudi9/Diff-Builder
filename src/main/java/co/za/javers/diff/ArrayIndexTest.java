package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class ArrayIndexTest {
    public static void main(String[] args) {
        final int[] abc = new int[10];

        System.out.println(abc[9]);
        System.out.println(abc[9]);
        System.out.println(abc[10]);
        System.out.println(abc[0]);
        System.out.println(abc.length);
    }
}
