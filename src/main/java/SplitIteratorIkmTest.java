import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Spliterator;

public class SplitIteratorIkmTest {
    public static void main(String[] args) {
        ArrayList <Integer> integers = new ArrayList <>(Arrays.asList(1, 2, 3));
        for (int i = 1; i <= 3; i++) {
            integers.add(i);
        }

        Spliterator <Integer> spliterator = integers.spliterator();
        spliterator.forEachRemaining(z -> System.out.print(z + "  "));

        Optional <Integer> i1 = Optional.of(5);
        Optional <Integer> i2 = Optional.ofNullable(4);


    }
}
