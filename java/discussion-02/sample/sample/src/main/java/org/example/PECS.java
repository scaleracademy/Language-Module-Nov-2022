package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class PECS {
    static class Person {
        void stand() {}
        void sit() {}
    }
    static class Student extends Person {
        void study() {}
    }
    static class Teacher extends Person {}

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        Student s1 = new Student();
        Student s2 = new Student();

        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();

        ArrayList<Person> plist = new ArrayList<>();
        ArrayList<Student> slist = new ArrayList<>();
        ArrayList<Teacher> tlist = new ArrayList<>();

        plist.add(s1);
        plist.addAll(slist);
        plist.parallelStream().forEach(Person::sit);

//        slist.add(p1);   // NOT ALLOWED

    }
}
