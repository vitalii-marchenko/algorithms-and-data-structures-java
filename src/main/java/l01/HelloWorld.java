package l01;

public class HelloWorld {
    private void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new HelloWorld().run();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");
    }
}
