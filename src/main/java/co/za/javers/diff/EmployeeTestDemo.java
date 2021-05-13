package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class EmployeeTestDemo {
    public static <T> void print(T... a){
        for (T t : a) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        print("MY","Test");
        print(new Employee<Integer,String>(1,"one"),new Employee<Integer,String>(2,"two"));
    }
}
class Employee<T1,T2>{
    Employee(int id, String name){

    }
}