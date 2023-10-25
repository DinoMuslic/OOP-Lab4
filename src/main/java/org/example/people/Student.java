package org.example.people;

import org.example.people.Person;

public class Student extends Person{
    private int credits = 0;

    public Student(String name, String address) {
        super(name, address);
    }

    public int getCredits() {
        return credits;
    }

    public void study() {
        this.credits++;
    }
}
