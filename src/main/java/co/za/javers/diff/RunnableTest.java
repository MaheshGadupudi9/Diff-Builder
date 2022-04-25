package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class RunnableTest {
    public static void main(String[] args) {
        Runnable r = ()-> System.out.println("Hi");
        new Thread(r).start();
    }
}
