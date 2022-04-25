package co.za.javers.diff;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class MathOpsTest {
    static int num2=getValue();

    static int num1=10;

     static int getValue() {
        return num1;
    }
     static int dosum() {
        return num1+num2;
    }
     static int dominus() {
        return num1-num2;
    }

    public static void main(String[] args) {
        System.out.println(dosum());
        System.out.println(dominus());

     /*   new FileOutputStream(new File()).tr*/


        int i =10, j=22;

        for(;;){
            if(i++<j--)
                continue;
            else break;
            //System.out.println(i+" "+j); java: unreachable statement
        }
    }



}
