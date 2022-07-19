package com.fasttrack.Exercise3;

import java.util.LinkedList;
import java.util.List;

public class Company extends Person {
    private List<Person> company;
    private Person manager;

    public Company(String name, String position, int age) {
        super(name, position, age);
    }

    public Company(List<Person> company, String name, int age) {
        manager = new Person(name, age);
        company.add(manager);
        this.company = company;
    }

    @Override
    public String toString() {
        return "Company " + company + "\n" + " ";
    }

    public Person getManager() {
        int index = 0;
        for (Person person : company) {
            if ((person.getPosition()).equals("manager")) {
                index = company.indexOf(person);
            }
        }
        return company.get(index);
    }

    public List<Person> getPersons(String profession) {
        List<Person> thePersonsProfessions = new LinkedList<>();
        for (Person person : company) {
            if ((person.getPosition()).equals(profession)) {
                thePersonsProfessions.add(person);
            }
        }
        return thePersonsProfessions;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> theOlderPersons = new LinkedList<>();
        for (Person person : company) {
            if (person.getAge() > age) {
                theOlderPersons.add(person);
            }
        }
        return theOlderPersons;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> thePersons = new LinkedList<>();
        for (Person person : company) {
            if ((person.getName()).contains(filterName)) {
                thePersons.add(person);
            }
        }
        return thePersons;
    }

    public void employ(Person person) {
        if (!(person.getPosition().equals("manager"))) {
            company.add(person);
        } else {
            company.remove(getManager());
            company.add(person);
        }
    }

}
