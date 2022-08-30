package self_preparation.java_features.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Thread(new CodeToRun()).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running runnable");
            }
        }).start();

        new Thread(() -> System.out.println("One line"));

        new Thread(() -> {
            System.out.println("Running runnable");
            System.out.println("Line 2");
            System.out.println("Line 3");
        }).start();


        new CodeToRun(() -> System.out.println("1"));


        Employee john = new Employee("John Doe", 30);
        Employee rob = new Employee("Rob Doe", 31);
        Employee sam = new Employee("Sam Doe", 40);
        Employee will = new Employee("Will Doe", 80);
        Employee clay = new Employee("Clay Doe", 10);

        List<Employee> employees = Arrays.asList(john, rob, sam, will, clay);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });

        employees.forEach(e -> System.out.println(e.getName()));


        Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        System.out.println("========");

        employees.forEach(employee -> System.out.println(employee.getName()));

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();

        UpperConcat ucWithResult = (s1, s2) -> {
            return s1.toUpperCase() + s2.toUpperCase();
        };

        String sillyString = doStringStuff((s1, s2) -> s1.toUpperCase() + s2.toUpperCase(), "Hey", "There");
        System.out.println(sillyString);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class CodeToRun implements Runnable {

    public CodeToRun() {

    }

    public CodeToRun(MySuperFunctionalInterface mySuperFunctionalInterface) {

    }

    @Override
    public void run() {
        System.out.println("Running runnable");
    }

    MySuperFunctionalInterface mySuperFunctionalInterface = (() -> System.out.println("1"));
}

@FunctionalInterface
interface MySuperFunctionalInterface {
    void interfacePrinter();
}

@FunctionalInterface
interface UpperConcat {
    String upperAndConcat(String s1, String s2);

    default int get() {
        return 2;
    }
}


class Employee {
    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
