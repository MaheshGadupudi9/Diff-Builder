package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class ConstructorTest {
}


class SuperTest{

}

class ChildTest extends SuperTest{

    int id;

    public ChildTest(int id) {
        super();
//        this();
        this.id = id;

    }

    public ChildTest() {

    }
}