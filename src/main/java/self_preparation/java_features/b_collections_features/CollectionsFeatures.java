package self_preparation.java_features.b_collections_features;

import java.util.*;

public class CollectionsFeatures {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        numbers.forEach(num -> System.out.print(num + " "));

        System.out.println("===========");

        List <Integer> numbers2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        numbers2.removeIf(s -> s > 5);
        numbers2.forEach(s -> System.out.print(s + " "));

        Map<String, String> books = new HashMap<>();
        books.put("Война и мир", "Лев Толстой");
        books.put("Преступление и наказание", "Федор Достоевский");
        books.put("Философия Java", "Брюс Эккель");
        books.put("Братья Карамазовы", "Федор Достоевский");
        books.put("Властелин Колец", "Джон Толкин");
        books.forEach((a,b) -> System.out.println("Название книги: " + a + ". Автор: " + b));

        System.out.println("===========");

        Map <String, String> book2 = new HashMap<>();
        books.put("Война и мир", "Лев Толстой");
        books.put("Преступление и наказание", "Федор Достоевский");
        books.put("Философия Java", "Брюс Эккель");
        books.put("Братья Карамазовы", "Федор Достоевский");
        books.put("Властелин Колец", "Джон Толкин");
        books.forEach((a,b) -> System.out.println("Название книги: " + a + ". Автор: " + b));

        books.compute("Философия Java", (a,b) -> b = "крутой чувак");
        System.out.println("_______________________");
        books.forEach((a,b) -> System.out.println("Название книги: " + a + ". Автор: " + b));

    }
}
