package co.za.javers.diff;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class TestWriteClass {
    public static void main2(String[] args) throws IOException {
        File file = new File("Data.txt");
        FileWriter fileWriter = new FileWriter(file);
//        Stream.of('0','1','2','3','4').forEach(fileWriter::write);
    }
    void test(){}

    public static void main(String[] args) {
        Integer n1 = new Integer(1);
        Integer n2= n1;
        n1+=1;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
}
