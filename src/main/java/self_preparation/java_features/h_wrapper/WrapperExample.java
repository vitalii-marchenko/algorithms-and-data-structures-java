package self_preparation.java_features.h_wrapper;

public class WrapperExample {

    public static void main(String[] args) {
        Cat cat = new Cat("Васька ");
        Cat catWrap = new CatWrapper(cat);
        printName(catWrap);
    }

    public static void printName(Cat named)
    {
        System.out.println(named.getName());
    }
}
