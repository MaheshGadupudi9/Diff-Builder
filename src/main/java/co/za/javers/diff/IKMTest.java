package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class IKMTest {
    private  int data;

    public IKMTest() {
        this(10);
        //System.getProperties().
    }

    public IKMTest(int i) {
        this.data=i;
    }

    public void display(){
        class Decrementer{
            public void decreemnet(){
                data--;
            }
        }
            Decrementer d= new Decrementer();
            d.decreemnet();
        System.out.println("data = " + data);
        }


    public static void main(String[] args) {
        int data=0;
        IKMTest ikmTest = new IKMTest();
        ikmTest.display();
        System.out.println("data = " + data);
    }
}
