package self_preparation.java_features.k_inheritance;

public class Dog extends Anial {

    public Dog(int size) {
        super(size);
        System.out.println(rrr);
    }

    public static void main(String[] args) {
        Dog d = new Dog(5);
        d.bark();
        staticBark();
    }
}
