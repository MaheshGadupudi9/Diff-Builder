package co.za.javers.diff.dto;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */

public class Person {
    private Integer id;
    private String name;
    private Gender gender;

    // standard getters/constructors


    public Person() {
    }

    public Person(Integer id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

