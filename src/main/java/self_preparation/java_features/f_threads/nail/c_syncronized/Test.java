package self_preparation.java_features.f_threads.nail.c_syncronized;

import java.util.stream.IntStream;

public class Test {

    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        test.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(() -> IntStream.range(0, 1000000).forEach(i -> increment()));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(counter);
    }

    private synchronized void increment() {
        counter++;
    }
}

class MyFirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("Выполнен поток " + getName());
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            MyFirstThread thread = new MyFirstThread();
            thread.start();
        }
    }
}
