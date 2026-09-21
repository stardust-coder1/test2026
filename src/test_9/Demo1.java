package test_9;

class MyThread extends Thread {
    // run 就是线程要执行的任务，线程入口方法
    @Override
    public void run() {
        while (true) {
            System.out.println("hello thread");
            try {
                // 休眠1000毫秒 = 1秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        // t.start(); // 【重点】开启新线程，会自动调用run()
        t.run();      // 直接调用run，**不会创建新线程**，就是普通方法调用！

        while (true) {
            System.out.println("hello main");
            Thread.sleep(1000);
        }
    }
}