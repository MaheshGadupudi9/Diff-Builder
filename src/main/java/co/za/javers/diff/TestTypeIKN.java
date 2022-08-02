package co.za.javers.diff;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestTypeIKN {
    public static void main(String[] args) {
        Object x = 1.0;
        Boolean b = false;
        Double d = 0.0;

        if (x instanceof Boolean) {
            b = (Boolean) x;
            System.out.println("Instance is Boolean");
        } else {
            d = (Double) x;
            System.out.println("Instance is Double");
        }

        boolean cond1 = d == 2 ? true : false;
        if (cond1) {
            System.out.println("perform action 1");
        }

        double e = 1.0;
        if ((Double) e instanceof Double | d++ == e++) {
            d += d;
        }

        boolean cond2 = d < 2 ? true : false;
        if (!cond2) {
            System.out.println("perform action 2");
        }

        boolean cond3 = cond1 ^ cond2;
        if (cond3) {
            System.out.println("perform action 3");
        }

        IntStream stream = IntStream.of(1, 2, 3);
        stream.boxed().collect(Collectors.toList()).forEach(System.out::println);

    }
}
