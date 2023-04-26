class Worker extends Employee {

    public Worker(String status, String name, String surName, double salary, int age) {

        super(status, name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

}
