package self_preparation.java_features.m_multythreding;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread task = new TestThread();
        Thread thread1 = new Thread(task);
        thread1.start();
        // join() will wait thread1 finishes its work
        //thread1.join();
        for (int i = 0; i < 1000; i++) {
            System.out.println("ssss");
        }

        TestThread task1 = new TestThread();
        Thread thread2 = new Thread(task1);
        thread2.start();
    }



    public static class TestThread implements Runnable{
        private static int i=0;

        TestThread(){
            i++;
        }
        @Override
        public void run() {
            for (int j = 0; j < 1000; j++) {
                System.out.println("My first thread "+i);
            }
        }
    }
}