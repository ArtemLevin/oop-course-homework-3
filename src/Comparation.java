import java.util.Comparator;

class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2){

        return Double.compare(o1.calculateSalary(), o2.calculateSalary());
    }
}

class ReverseSalaryComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2){

        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}

class NameComparator implements Comparator<Employee>{
    public int compare(Employee o1, Employee o2){
        return o1.name.compareTo(o2.name);
    }

}class AgeComparator implements Comparator<Employee>{

    public int compare(Employee o1, Employee o2){
        return Integer.compare(o2.age, o1.age);
    }
}
