package org.example.people;
import org.example.people.Person;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return this.getName() + "\n " + this.getAddress() + " " + this.getSalary();
    }
}
