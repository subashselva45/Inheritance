package io.pragra.learning;

public class Person {
    private String name;
    private int age;
    private Address address;

   /* public Person(){
        System.out.println("$$$$$$ CREATING PERSON $$$$$$");
    }*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void speak(){
        System.out.println("Speaks from his mind");
    }

}
