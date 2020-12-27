package io.pragra.learning;

public class PracticeCxo extends PracticeManager{
    private double incentives;

    public PracticeCxo(String name, int age, int employeeId, double hourlyRate, double bonus, double incentives) {
        super(name, age, employeeId, hourlyRate, bonus);
        this.incentives = incentives;
    }

    @Override
    public double salary() {
        return super.salary()+incentives;
    }
}
