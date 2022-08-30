package self_preparation.java_features.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class AnotherStream {

    private static List<String> someBigNumbers = asList(
            "N40", "G42", "I40", "N434", "R40", "R12", "G41", "g11"
    );

    public static void main(String[] args) {
        someBigNumbers.stream()
                .map(String::toUpperCase)
                .filter(num -> num.startsWith("R"))
                .collect(toList());


        IntStream intStream = IntStream.of(1, 2, 3, 40, 12, 99);


        // FlatMap

        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));

        List<String> allPets = humans.stream()
                .map(Human::getPets)
                .flatMap(pets -> pets.stream())
                .collect(toList());


        allPets.forEach(System.out::println);


        System.out.println("================\n");


        allPets.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("================\n");

        humans.stream()
                .sorted(Comparator.comparing(Human::getName))
                .forEach(h -> System.out.println(h.getName()));

        System.out.println("================\n");

        int sum = Stream.of(1, 2, 56, 34, 33)
                .reduce(0, (acc, x) -> acc + x);


        boolean isbiggerThan7 = Stream.of(1, 2, 56, 34, 33).allMatch(x -> x > 0);
    }

}


class Human {

    private final String name;
    private final List<String> pets;

    public String getName() {
        return name;
    }

    public List<String> getPets() {
        return pets;
    }

    Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }
}