package self_preparation.java_features.k_inheritance;

public class Anial {
    private int size;
    private int age;

    public static int rrr = 12;

    public Anial(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void bark() {
        System.out.println("Woof");
    }

    public static void staticBark() {
        System.out.println("Static Woof");
    }

}
