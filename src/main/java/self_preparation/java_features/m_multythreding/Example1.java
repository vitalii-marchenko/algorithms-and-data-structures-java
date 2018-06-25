package self_preparation.java_features.m_multythreding;

public class Example1 {

    static class Printer implements Runnable {

        @Override
        public void run() {
            System.out.println("I am a Printer");
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread childThread = new Thread(printer);
        childThread.start();
    }
}
