package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
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