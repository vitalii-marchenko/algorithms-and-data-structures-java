package self_preparation.java_features.f_threads;

public class ThreadsExample {

    static class Printer implements Runnable {
        private String name;

        public Printer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("I’m " + this.name);
        }
    }

    public static void main(String[] args) {
        Printer printer1 = new Printer("Коля");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        Printer printer2 = new Printer("Вася");
        Thread thread2 = new Thread(printer2);
        thread2.start();
    }
}
