package co.za.javers.diff;

import java.io.*;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class ReadFromInputTextFile {
    public static void main(String[] args) throws IOException {
        new FileReader("input.dat").read();
/*        new BufferedReader("input.dat");
        new BufferedReader(new File("input.dat"));
        new BufferedReader(new InputStreamReader("input.dat"));*/


    }

}
