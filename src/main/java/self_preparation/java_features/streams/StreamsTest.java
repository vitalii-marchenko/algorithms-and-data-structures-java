package self_preparation.java_features.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args) {
        List<String> someBigNumbers = Arrays.asList(
          "N40", "G42", "I40", "N434", "R40", "R12", "G41", "g11"
        );

        someBigNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);


        Stream.generate(() -> 5)
                .limit(5)
                .forEach(System.out::println);

        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}
