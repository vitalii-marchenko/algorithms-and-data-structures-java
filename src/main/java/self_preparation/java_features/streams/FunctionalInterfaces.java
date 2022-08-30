package self_preparation.java_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee rob = new Employee("Rob Doe", 31);
        Employee sam = new Employee("Sam Doe", 40);
        Employee will = new Employee("Will Doe", 80);
        Employee clay = new Employee("Clay Doe", 10);
        Employee red = new Employee("Red Doe", 34);
        Employee charming = new Employee("Charming Doe", 38);

        List<Employee> employees = Arrays.asList(john, rob, sam, will, clay, red, charming);
        // Consumer
        employees.forEach(e -> System.out.println(e.getName() + ": " + e.getAge()));


        System.out.println("===================");

        System.out.println("Employees over 35:");
        System.out.println("===================");
        for (Employee employee : employees) {
            if (employee.getAge() > 35) {
                System.out.println(employee.getName());
            }
        }


        System.out.println("Employees over 35:");
        System.out.println("===================");
        System.out.println("=======Lambda========");

        employees.forEach(e -> {
            if (e.getAge() > 35) {
                System.out.println(e.getName());
            }
        });


        Predicate<Employee> ageCondition = e -> e.getAge() > 35;
        printEmployeesByAge(employees, ageCondition);
    }

    // Predicate
    private static void printEmployeesByAge(List<Employee> employees, Predicate<Employee> ageCondition) {
        System.out.println("Employees over 35:");
        System.out.println("===================");
        System.out.println("=======Predicate========");

        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
