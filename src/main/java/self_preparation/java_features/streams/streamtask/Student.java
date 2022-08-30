package self_preparation.java_features.streams.streamtask;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Student {
    private final String name;
    private final Integer age;
    private final Gender gender;

    public Student(String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    private enum Gender {
        MAN,
        WOMAN
    }

    public static List<Student> getStudentByPredicate(Predicate<Student> studentPredicate, List<Student> students) {
        return students.stream()
                .filter(st -> studentPredicate.test(st))
                .collect(toList());
    }

    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN),
                new Student("Дмитрий", 17, Gender.MAN)
        );


        List<Student> allDimas = students.stream()
                                            .filter(st -> st.getName().equals("Дмитрий"))
                                            .collect(toList());

        List<Student> men = students.stream()
                .filter(st -> st.getGender().equals(Gender.MAN))
                .collect(toList());

        Integer average = men.stream()
                .map(Student::getAge)
                .reduce(Integer::sum)
                .map(sum -> sum / men.size())
                .get();


        double avg = men.stream()
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble();

        men.stream()
                .filter(st -> st.getAge() > 17 && st.getAge() < 28)
                .collect(Collectors.toList());


        System.out.println(average);
        System.out.println(avg);

        int sumOfAllAges = students.stream()
                .map(Student::getAge)
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println("Sum of ages: " + students);

        List<String> names = Arrays.asList("Vova", "Petro", "Ivan", "Yevheniia");
        names.replaceAll(name -> name.toUpperCase());
    }
}
