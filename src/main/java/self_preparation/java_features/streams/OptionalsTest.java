package self_preparation.java_features.streams;

import java.util.Optional;

public class OptionalsTest {

    public static void main(String[] args) {
        Optional<String> name = Optional.of("John");
        System.out.println(name.get());

        //Optional<String> nullName1 = Optional.of(null);
        //System.out.println(nullName.get());


        Optional<String> nullName2 = Optional.ofNullable(null);
        System.out.println(nullName2);

        System.out.println(nullName2.orElse("Empty"));

//        nullName2.orElseThrow(() -> new RuntimeException("Supplier is empty"));
//        nullName2.orElseThrow(() -> new RuntimeException("Supplier is empty"));

        nullName2.orElse("I'm epmty");

        Optional<String> opt = Optional.of("baeldung");

        opt.ifPresent(System.out::println);

        String nullName = null;
        String someName = Optional.ofNullable(nullName).orElse("john");
    }
}
