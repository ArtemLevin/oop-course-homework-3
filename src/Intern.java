class Intern extends Employee{
    public Intern(String status, String name, String surName, double salary, int age) {
        super(status, name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
