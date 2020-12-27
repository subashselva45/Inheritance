package io.pragra.learning;

public class PracticePerson {
    private String name;
    private int age;

    public PracticePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails(){
        System.out.println(" His name is" +name);
        System.out.println("His age is" + age);
    }
}
