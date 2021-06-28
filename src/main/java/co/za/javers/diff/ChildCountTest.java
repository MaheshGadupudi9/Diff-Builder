package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class ChildCountTest extends Parent {
    public ChildCountTest() {
   count++;
    }

    public static void main(String[] args) {
        System.out.println(getCount());
        ChildCountTest childCountTest = new ChildCountTest();
        System.out.println(getCount());

    }
}
class ParentC
{
    protected static int count=0;

    public ParentC() {
        count++;
    }
    static int getCount(){return count;}
}

