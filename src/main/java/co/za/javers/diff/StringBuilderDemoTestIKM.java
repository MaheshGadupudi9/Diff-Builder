package co.za.javers.diff;

import java.util.Scanner;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class StringBuilderDemoTestIKM {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (String arg : args) {
            if(sb.indexOf(arg)<1){
                sb.append(arg+" ");
            }
        }

        System.out.println("sb.toString() = " + sb.toString());

        Scanner scanner = new Scanner(sb.toString());
        while (scanner.hasNext()){

            if(scanner.hasNextInt()){
                System.out.println("scanner.nextInt()"+ scanner.nextInt() + " ");
            }else scanner.next();

        }

    }
}
