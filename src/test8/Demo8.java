package test8;

public class Demo8 {
    public static void main(String[] args) {
        Object locker = new Object();

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("wait 之前");
                synchronized (locker) {
                    locker.wait(); // 释放锁，等待唤醒
                }
                System.out.println("wait 之后");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        try {
            Thread.sleep(2000); // 这里就不会报错
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (locker){
            locker.notify();
        }
    }
}
