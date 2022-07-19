package com.fasttrack.Exercise3;

public  class  Person {
    private String name;
    private String position;
    private int age;

    public Person(String name, String position, int age ) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public Person (){
    }

    public Person( String name, int age){
        this.name=name;
        this.age=age;
        this.position="manager";
    }
    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  "\n" + "Person: " + "\n" +
                       " Name:  " + name + "\n" +
                       " position: " + position + "\n" +
                       " age: " + age;
    }
}
