package io.pragra.learning;

public class PracticeEmployee extends PracticePerson {
    private int employeeId;
   private  double hourlyRate;

    public PracticeEmployee(String name, int age, int employeeId, double hourlyRate) {
        super(name, age);
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
    }

    public double salary(){
        return hourlyRate*21*8;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("His Employee Id is"+ employeeId);
        System.out.println(" His salary is"+ salary());
    }
}
