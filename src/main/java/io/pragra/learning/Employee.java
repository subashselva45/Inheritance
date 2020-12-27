package io.pragra.learning;

public class Employee extends Person {
   /* public Employee(){
        System.out.println("###### CREATING EMPLOYEE ######");
        */

    public Employee(String name, int age) {
        super(name, age);
    }
        public void work(){
            super.speak();
            System.out.println("Do your work");
    }
}

