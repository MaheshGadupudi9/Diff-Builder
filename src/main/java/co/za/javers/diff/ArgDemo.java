package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class ArgDemo {
    public static void main(String... s) {
        System.out.println(s[1]+s[2]+s[3]);


        Runnable r =() -> System.out.println("Hi");

        new Thread(r).start();
    }
}
