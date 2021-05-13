package co.za.javers.diff;

import java.io.*;
import java.time.LocalDate;
import java.time.Year;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
      boolean b =false;
      int n=5;
        System.out.println(b||n==5);
        System.out.println(b=true&&n==5);
        System.out.println(b);

    }

}
enum Element{
    HELIUM("He","Gas"),MAGNESIUM("Mg","Solid");
    private String symbol;
    private String nature;

    Element(String symbol, String nature) {
        this.symbol = symbol;
        this.nature = nature;
    }

    public String getSymbol() {

        return symbol;
    }

    public String getNature() {
        return nature;
    }
}
