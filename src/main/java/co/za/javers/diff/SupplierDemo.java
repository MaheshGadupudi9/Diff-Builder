package co.za.javers.diff;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class SupplierDemo {


    public static void main(String[] args) {
        Supplier<String> i = () -> "Car";
        Consumer<String> c = x -> System.out.print(x.toLowerCase());
        Consumer<String> d = x -> System.out.print(x.toUpperCase());

        c.andThen(d).accept(i.get());
        System.out.println();
    }
}