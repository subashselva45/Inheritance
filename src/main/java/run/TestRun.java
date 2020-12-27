package run;

import io.pragra.learning.Employee;
import io.pragra.learning.Person;


public class TestRun {
   /* String name;
    public int sum(int a,int b){
        System.out.println(add(6.5,7.5));
       return a+b;
    }
    public static double add(double a, double b){
        return a+b;

    }*/
   private static int count;
    private static String[] stops = new String[] { "Washington",
            "Monroe", "Jackson", "LaSalle" };
    public static void main(String[] args) {
        while (count < stops.length) {
            if (stops[count++].length() < 8) {
                break;
            }
        }
        System.out.println(count);
    }
}



/*// public static void main(String[] args) {

         // Person person = new Person("Subash",25);

       // Employee employee = new Employee("vivek", 30);
        //employee.speak();
        //employee.work();
        //System.out.println(employee);
       // System.out.println(add(3.5, 7.5));
       // System.out.println(sum(2,3));
    }
}*/
