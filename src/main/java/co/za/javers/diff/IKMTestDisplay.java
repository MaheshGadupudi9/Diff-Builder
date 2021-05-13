package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class IKMTestDisplay {
     int data;

    void display(){
        System.out.println("data ="+data);
    }

    public static void main(String[] args) {
        int x=0;
        IKMTestDisplay display = new IKMTestDisplay();
        display.display();

        System.out.println(new Double("17.64d"));
        System.out.println(new Float(17.64));
//        System.out.println(Integer.parseUnsignedInt(4));
new Boolean("false");
    }
}
