package io.pragra.learning;

public class PracticeManager extends PracticeEmployee {
    private double bonus;

    public PracticeManager(String name, int age, int employeeId, double hourlyRate, double bonus) {
        super(name, age, employeeId, hourlyRate);
        this.bonus = bonus;
    }

    @Override
    public double salary() {
        return super.salary()+bonus;
    }
}
