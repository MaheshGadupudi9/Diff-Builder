/*TEST COMMRENY*/
/*TEST COMMRENY*/
package co.za.javers.diff;
import org.apache.catalina.connector.Response;

import java.io.*;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */

public class Test {

        private String s = "HELLO";


    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
         new Test().doSome();
         Thread.sleep(2000);



    }

    private void doSome() {
         Object[] objects = new Object[2];
        for (int i = 0; i < objects.length; i++) {
            objects[i]=new Object();
        }
    }
}



