package self_preparation.java_features.f_threads.nail.a_thread;

public class Test {

    public static void main(String[] args) {
//        MyThread thread = new MyThread();
//        thread.start();
//
//        MyThread thread2 = new MyThread();
//        thread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();

    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from MyThread " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from MyThread " + i);
        }
    }
}
