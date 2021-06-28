package co.za.javers.diff.newp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class ListTestException {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(HumanType.MEN));
        people.add(new Person(HumanType.MEN));
        people.add(new Person(HumanType.MEN));
        people.add(new Person(HumanType.MEN));
        people.add(new Person(HumanType.MEN));
        people.add(new Person(HumanType.MEN));
        people.add(new Person(HumanType.WOMEN));
        people.add(new Person(HumanType.WOMEN));
        people.add(new Person(HumanType.WOMEN));
        people.add(new Person(HumanType.WOMEN));
        people.add(new Person(HumanType.MEN));

        /*for (Person p : people) {
            if (p.getHumanType().equals(HumanType.WOMEN)){
                people.remove(p);
            }
        }*/
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
            if (next.getHumanType().equals(HumanType.WOMEN)){
                iterator.remove();
            }
        }

        System.out.println("people = " + people);

        Map<Integer, Integer> integerMap = new HashMap<>();
        int i=0;
        integerMap.put(i++,i);
        integerMap.put(i++,i);
        integerMap.put(i++,i);
        integerMap.put(i++,i);
        integerMap.put(i++,i);
        integerMap.put(i++,i);
        integerMap.put(i++,i);

        /*for (Integer integer : integerMap.keySet().i) {
            if (integer%2==0) {
                integerMap.remove(integer);
            }
        }*/
        Iterator<Integer> iterator1 = integerMap.keySet().iterator();

        for (;iterator1.hasNext();) {
            Integer next = iterator1.next();
            if (next%2==0) {
                iterator1.remove();
            }
        }

        System.out.println("integerMap = " + integerMap);
    }
}

class Person implements Human {

    private final HumanType type;

    public Person(HumanType type) {
        this.type = type;
    }

    @Override
    public HumanType getHumanType() {
        return type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type=" + type +
                '}';
    }
}




enum HumanType{
    MEN,WOMEN
}
interface Human{
    public HumanType getHumanType();
}

