package self_preparation.java_features.m_multythreding;

public class IsInterruptExample {

    static class Clock implements Runnable {

        @Override
        public void run() {
            Thread current = Thread.currentThread();

            while (!current.isInterrupted()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000);
        clockThread.interrupt();
    }
}
