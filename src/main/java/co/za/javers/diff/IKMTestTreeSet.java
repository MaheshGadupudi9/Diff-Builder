package co.za.javers.diff;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class IKMTestTreeSet {
    public static void main(String[] args) {
        SortedSet<Element2> s = new TreeSet<>();
        s.add(new Element2(15));
        s.add(new Element2(10));
        s.add(new Element2(25));
        s.add(new Element2(10));

        System.out.println(s.first() +"  "+s.size());
    }
}

class Element2 implements Comparable{

   int id;

    public Element2(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        Element2 element2= (Element2) o;
        return this.id-element2.id;

    }

    @Override
    public String toString() {
        return ""+this.id;
    }
}