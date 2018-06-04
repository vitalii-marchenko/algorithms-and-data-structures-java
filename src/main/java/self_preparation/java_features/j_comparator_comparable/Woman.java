package self_preparation.java_features.j_comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Woman implements Comparable<Woman> {

    public int age;

    public Woman(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Woman o) {
        return this.age - o.age;
    }

    public static void main(String[] args ) {
        ArrayList<Woman> women = new ArrayList<Woman>();
        women.add(new Woman(18));
        women.add(new Woman(21));
        women.add(new Woman(5));

        Collections.sort(women);
    }
}
