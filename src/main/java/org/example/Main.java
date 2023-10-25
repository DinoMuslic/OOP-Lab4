package org.example;

import org.example.people.Person;
import org.example.people.Student;
import org.example.people.Student1;
import org.example.people.Teacher;

import org.example.shapes.*;
import org.example.enums.FillType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printDepartment(List<Person> people) {
        for(Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {
        // Task 1 a)
//        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
//
//        System.out.println(pekka);
//        System.out.println(esko);

        // Task 1 b)
//        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
//        System.out.println(olli.toString());
//        System.out.println("Credits: " + olli.getCredits());
//        olli.study();
//        System.out.println("Credits: " + olli.getCredits());

         //Task 1 c)
//        Teacher pekka1 = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
//        Teacher esko1= new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
//        Student olli1 = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
//        System.out.println(pekka1);
//        System.out.println(esko1);
//        System.out.println(olli1);

//        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
//        for ( int i=0; i < 25; i++ ) {
//            olli.study();
//        }
//        System.out.println("Credits: " + olli.getCredits());

        // Task 1 d)
//        List<Person> people = new ArrayList<Person>();
//        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
//        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
//
//
//        printDepartment(people);

        // Task 2
//        Circle circle = new Circle("red", FillType.FILLED, 5.2);
//        Rectangle rectangle = new Rectangle("blue", FillType.NOT_FILLED, 6, 2.5);
//
//        circle.displayInfo();
//        rectangle.displayInfo();

        // Task 4
//        Student1 st = new Student1(1, "Asdf 123");
//        st.addGrade(4.5);
//        st.addGrade(3.1);
//        st.addGrade(4.7);
//        System.out.println(st.getGrades());
    }
}