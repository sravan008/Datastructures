package org.ksk.java8;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import dto.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8Comprator {

    public static List<Person> getPersons(List<Person> persons) {
        Collections.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        return persons;
    }


    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 23, "USA"));
        persons.add(new Person("Carl", 23, "Australia"));
        persons.add(new Person("Amit", 23, "India"));
        persons.add(new Person("Vikram", 23, "Bhutan"));
        persons.add(new Person("Kane", 23, "Brazil"));

        List<Person> sortedPersons = Java8Comprator.getPersons(persons);

        System.out.println("Persons after sorting");
        // Printing the name of each person.
        for (Person person : sortedPersons) {
            System.out.println("Person Name : " + person.getName());
        }

    }
}
