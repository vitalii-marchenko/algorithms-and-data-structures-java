package self_preparation.java_features.j_comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Woman2 {

    public int age;
    public int childrenCount;
    public int weight;
    public int height;
    public String name;

    public Woman2(int age) {
        this.age = age;
    }

    public static void main(String[] args )
    {
        ArrayList<Woman2> women = new ArrayList<Woman2>();
        women.add(new Woman2(18));
        women.add(new Woman2(21));
        women.add(new Woman2(5));

        Comparator<Woman2> compareByHeight = new Comparator<Woman2>() {
            public int compare(Woman2 o1, Woman2 o2) {
                return o1.height - o2.height;
            }
        };

        Collections.sort(women, compareByHeight);

        Comparator<Woman2> compareByName = new Comparator<Woman2>() {
            public int compare(Woman2 o1, Woman2 o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(women, compareByName);
    }
}
