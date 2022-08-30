package self_preparation.java_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionsTest {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee rob = new Employee("Rob Doe", 31);
        Employee sam = new Employee("Sam Doe", 40);
        Employee will = new Employee("Will Doe", 80);
        Employee clay = new Employee("Clay Doe", 10);

        List<Employee> employees = Arrays.asList(john, rob, sam, will, clay);

        Function<Employee, String> getLastNameFunction = (Employee employee) -> employee.getName().substring(employee.getName().indexOf(' ') + 1);

        for (Employee employee : employees) {
            System.out.println(getLastNameFunction.apply(employee));
        }

        employees.forEach(e -> System.out.println(getLastNameFunction.apply(e)));

        Function<String, Integer> stringToIntegerFunction = (stringNumber) -> Integer.valueOf(stringNumber);

        Integer integer = stringToIntegerFunction.apply("1");

        String lastName = getEmployeeName((Employee e) -> e.getName().substring(e.getName().indexOf(' ') + 1), employees.get(0));

        Function<String, String> firstNameFunction = name -> name.substring(0, name.indexOf(' '));

        Function<Employee, String> uppercaseNameFunction = (e) -> e.getName().toUpperCase();
        Function chainedFunction = uppercaseNameFunction.andThen(firstNameFunction);
        System.out.println(chainedFunction.apply(employees.get(0)));

        BiFunction<String, Employee, String> concatAge = (name, employee) -> name.concat(" " + employee.getAge());
        Function<Employee, String> ca = (e) -> e.getName() + " " + e.getAge();
        String apply = concatAge.apply(employees.get(0).getName(), employees.get(0));
    }

    private static String getEmployeeName(Function<Employee, String> nameFunction, Employee employee) {
        return nameFunction.apply(employee);
    }
}
