package co.za.javers.diff;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class SorterIKMTest {

    public static void main(String[] args) {
        Consumer<Namer> printIt = namer -> System.out.println(namer.getFirstName()+" "+namer.getLastNAme());

        ArrayList<Namer> namerArrayList = new ArrayList<>(Arrays.asList(
                new Namer("Harry", "Smith"), new Namer("Joe", "Smith"), new Namer("Jane", "Doe"), new Namer("Mary", "Jane"), new Namer("Harry", "Homeowner")
        ));

        Comparator<Namer> grouPBy = Comparator.comparing(e -> e.getFirstName());
        grouPBy = grouPBy.thenComparing(e->e.getLastNAme());
        namerArrayList.removeIf(e->e.getFirstName().equals("Mary"));
        namerArrayList.sort(grouPBy);
        namerArrayList.forEach(printIt);

    }

}


class Namer{
    final private String firstName,lastNAme;

    Namer(String firstName, String lastNAme) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }
}