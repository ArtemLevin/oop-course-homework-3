class Freelancer extends Employee{
    public Freelancer(String status, String name, String surName, double salary, int age) {
        super(status, name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
