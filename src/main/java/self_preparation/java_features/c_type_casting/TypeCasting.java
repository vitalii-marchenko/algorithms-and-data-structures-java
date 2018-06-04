package self_preparation.java_features.c_type_casting;

public class TypeCasting {

    public static void main(String[] args) {
        String s = "mama";
        Object o = s;  // o хранит String
        System.out.println(o);

        Object o2 = "mama";// o хранит String
        String s2 = (String) o;
    }
}
