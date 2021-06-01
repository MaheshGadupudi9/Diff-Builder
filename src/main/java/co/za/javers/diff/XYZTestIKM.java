package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class XYZTestIKM {

    public static void main(String[] args) {
        XYZTestIKM xyzTestIKM = new XYZTestIKM(1,2);
xyzTestIKM.display();

        System.out.println("xyzTestIKM.firstNo = " + xyzTestIKM.firstNo);
        System.out.println("xyzTestIKM.secondNo = " + xyzTestIKM.secondNo);
    }


    private int firstNo;
    private int secondNo;

    public XYZTestIKM(int firstNo, int secondNo) {
        this.firstNo = firstNo;
        this.secondNo = --secondNo;
    }

    public void  display(){
        class Sum{
            public  void  sum(){
                secondNo = firstNo +++secondNo;
            }

        }
            new Sum().sum();
        System.out.println("firstNo = " + firstNo);
        System.out.println("secondNo = " + secondNo);

    }

}
