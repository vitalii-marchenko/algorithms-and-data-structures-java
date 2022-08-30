package self_preparation.java_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateTest {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee rob = new Employee("Rob Doe", 31);
        Employee sam = new Employee("Sam Doe", 40);
        Employee will = new Employee("Will Doe", 80);
        Employee clay = new Employee("Clay Doe", 10);
        Employee red = new Employee("Red Doe", 34);
        Employee charming = new Employee("Charming Doe", 38);

        List<Employee> employees = Arrays.asList(john, rob, sam, will, clay, red, charming);
        Predicate<Employee> employeePredicate = e -> e.getAge() > 30;

        for (Employee employee : employees) {
            if (employeePredicate.test(employee)) {
                System.out.println(employee.getName());
            }
        }

        IntPredicate intPredicate = i -> i > 15;
        Predicate<Integer> integerPredicate2 = i -> i > 15;

        Supplier<Integer> supplier = () -> 1;

        Supplier<Boolean> booleanSupplier = () -> false;
        LongSupplier longSupplier = () -> 1L;
        Integer integer = supplier.get();
    }
}
