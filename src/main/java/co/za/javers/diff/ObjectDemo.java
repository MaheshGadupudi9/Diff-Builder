package co.za.javers.diff;

import java.util.Optional;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Optional<ObjectDemo> objectDemo = Optional.of(new ObjectDemo());
        System.out.println(objectDemo.get().toString());
    }

    @Override
    public String toString() {
        return "ObjectDemo";
    }
}
