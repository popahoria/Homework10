package com.fasttrack.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            List<Person> personList = new ArrayList<>();
            System.out.println("=================== company employees ================");
            personList.add(new Person("Vasile", "carpenter", 22));
            personList.add(new Person("Andrei", "welder",26 ));
            personList.add(new Person("Cristi", "plumber",34 ));
            personList.add(new Person("Sorin", "carpenter",37 ));
            personList.add(new Person("Ion", "plumber",47 ));
            Company company = new Company(personList, "Andrei", 33);
            System.out.println(company);

            System.out.println("================= get the manager =================");
            System.out.println((company.getManager()));

            System.out.println("================== show all carpenters ==================");
            System.out.println(company.getPersons("carpenter"));

            System.out.println("=================== older then 40 ================");
            System.out.println(company.getPersonsOlder(40));

            System.out.println("=================== info about Andrei ================");
            System.out.println(company.getPerson("Andrei"));

            System.out.println("=================== Andrei as manager =================");
            company.employ(new Person("Alex", "manager", 42));

            System.out.println("=================== company employees ================");
            System.out.println(company);
    }
}
