package test8;

public class Mythread extends Thread {
    // run()：线程执行入口方法，线程启动后自动执行该方法
    @Override
    public void run() {
        // 无限循环，每隔1秒打印一次内容
        while (true) {
            System.out.println("hello thread");
            try {
                // 让当前线程休眠1000毫秒（1秒）
                // sleep()会抛出受检异常InterruptedException，必须捕获处理
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // 线程被中断时触发此异常，包装为运行时异常抛出
                throw new RuntimeException(e);
            }
        }
    }

}