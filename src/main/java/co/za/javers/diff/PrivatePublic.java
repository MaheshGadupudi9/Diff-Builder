package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
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
