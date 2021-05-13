package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class IKMTestHelper {
    static class Helper{
        private int data=5;
        public void bump(int c){
            c++;
            data =data+c;
        }
    }

    public static void main(String[] args) {
        Helper helper = new Helper();
        int data=2;
        helper.bump(data);
        System.out.println( helper.data +"   "+data);
    }
}
