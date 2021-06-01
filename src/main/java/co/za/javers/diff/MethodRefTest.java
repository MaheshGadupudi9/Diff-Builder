package co.za.javers.diff;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class MethodRefTest {
    public static void main(String[] args) {

        Name n1 = new Name("Harry", "Homeowner");
        Name n2 = new Name("Paul", "Painter");
        Name n3 = new Name("Jane", "Doe");
        List<Name> names = Arrays.asList(n1, n2, n3);

        names.sort(Name::compareBylastName);
        names.forEach(System.out::println);


    }
}

class Name{
    private String first,last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Name() {
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }

    public static int compareBylastName(Name n1,Name n2){
        return n1.last.compareTo(n2.last);
    }
}