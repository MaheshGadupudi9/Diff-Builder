package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class PrivatePublic {
    private int ax;
    private class in{
        private String a;
        public int b = ax;

        public void m1(){
           // throw new RuntimeException();
        }
    }
}
