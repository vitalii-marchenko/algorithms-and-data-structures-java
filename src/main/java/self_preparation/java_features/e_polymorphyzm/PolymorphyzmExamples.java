package self_preparation.java_features.e_polymorphyzm;

public class PolymorphyzmExamples {

    static class Cow {

        public void printColor() {
            System.out.println("Я - белая");
        }
        public void printName() {
            System.out.println("Я - корова");
        }
    }

    // Наследовать и переопределять можно только нестатические методы.
    // Статические методы не наследуются и,
    // следовательно, не переопределяются.
    static class Whale extends Cow {


        @Override
        public void printName() {
            System.out.println("Not valid:");
            super.printName();
            System.out.println("Valid:");
            System.out.println("Я - кит");
        }
    }

    public static void main(String[] args) {
        Cow cow = new Cow();
        Whale whale = new Whale();

        cow.printColor();
        whale.printColor();
        cow.printName();
        whale.printName();
    }
}
