package self_preparation.java_features.b_collections_features;

import java.util.*;

public class Iterators {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }

        //все элементы хранятся в парах
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        Iterator<Map.Entry<String, String>> iteratorMap = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iteratorMap.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + ":" + value);
        }
    }
}
