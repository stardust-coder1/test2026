package test8;

public class Demo4 {
    public static void main(String[] args) {
        Runnable task = new MyThread4();
        Thread t = new Thread(task);
        t.start();
    }
}
