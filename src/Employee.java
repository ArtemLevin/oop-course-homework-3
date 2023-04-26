abstract  class Employee{

    protected String name;
    protected String surName;
    protected double salary;
    protected String status;

    protected int age;

    public Employee(String status, String name, String surName, double salary, int age) {
        this.status = status;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Статус: %s; Сотрудник: %s %s; Возраст: %d; среднемесячная ставка: %.2f", status, name, surName, age, salary);
    }

    public abstract double calculateSalary();

}
