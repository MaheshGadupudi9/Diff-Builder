package co.za.javers.diff;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Collectors;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class CalcTestIMK {

    public static void main(String[] args) throws FileNotFoundException {
        C1 c1 = new CalcTest();
        C2 c2 = new CalcTest();


        System.out.println("c1.calc(1,1) = " + c1.calc(1,1));
        System.out.println("c1.calc(1,1) = " + c2.calc(1,1));


        new BufferedReader(new FileReader("te")).lines().collect(Collectors.toList()).stream().forEach(System.out::println);
    }
}

 class CalcTest implements C1,C2{}

interface  C1{
    public static final int C1=1;
    public static final int C2=2;

    public default int calc(int a , int b){
        return a*C1 + b* C2;
    }
}

interface  C2{

    public default float calc(float a , float b){
        return C1.C1+C1.C2 * (a+b);
    }
}
