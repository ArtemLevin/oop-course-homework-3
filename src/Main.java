import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main{

    private static final Random rnd = new Random();

    static Worker generateWorker(){

        String[] names = new String[] {"Boris", "Andrew", "Stepan",
                "Igor", "Sergey", "Denis", "Fedor"};
        String[] surnames = new String[] {"Borisov", "Andreev", "Stepanov",
                "Igorev", "Denisov", "Sergeev", "Fedorov"};

        int salary = rnd.nextInt(200, 300);
        int index = rnd.nextInt(30, 50);
        int age = rnd.nextInt(18, 65);

        return new Worker("Worker",names[rnd.nextInt(7)], surnames[rnd.nextInt(7)],
                salary*index, age);
    }

    static Freelancer generateFreelancer(){

        String[] names = new String[] {"Boris", "Andrew", "Stepan",
                "Igor", "Sergey", "Denis", "Fedor"};
        String[] surnames = new String[] {"Borisov", "Andreev", "Stepanov",
                "Igorev", "Denisov", "Sergeev", "Fedorov"};

        int salary = rnd.nextInt(200, 300);
        int index = rnd.nextInt(30, 50);
        int age = rnd.nextInt(18, 65);

        return new Freelancer("Freelancer", names[rnd.nextInt(7)], surnames[rnd.nextInt(7)],
                salary*index, age);
    }
    static Intern generateIntern(){

        String[] names = new String[] {"Boris", "Andrew", "Stepan",
                "Igor", "Sergey", "Denis", "Fedor"};
        String[] surnames = new String[] {"Borisov", "Andreev", "Stepanov",
                "Igorev", "Denisov", "Sergeev", "Fedorov"};

        int salary = rnd.nextInt(200, 250);
        int index = rnd.nextInt(10, 20);
        int age = rnd.nextInt(18, 65);

        return new Intern("Intern", names[rnd.nextInt(7)], surnames[rnd.nextInt(7)],
                salary*index, age);
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){

            int funcIndex = rnd.nextInt(1,4);

            if (funcIndex == 1) employees[i] = generateWorker();
            if (funcIndex == 2) employees[i] = generateFreelancer();
            if (funcIndex == 3) employees[i] = generateIntern();
        }

        System.out.println();
        System.out.println("*** Базовый список сотрудников ***");

        for(Employee employee: employees){
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("*** Ранжирование по возрастанию зарплаты ***");
        Arrays.sort(employees, new SalaryComparator());

        System.out.println();
        for(Employee employee: employees){
            System.out.println(employee);
        }


        System.out.println();
        System.out.println("*** Ранжирование по убыванию возраста ***");
        Arrays.sort(employees, new AgeComparator());

        System.out.println();
        for(Employee employee: employees){
            System.out.println(employee);
        }

    }
}