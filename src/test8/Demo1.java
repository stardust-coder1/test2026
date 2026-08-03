package test8;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        // 1. 创建线程对象
        Mythread t = new Mythread();
        // 2. 调用start()启动线程（不能直接调用run()，直接调用只是普通方法执行，不会开启新线程）
        t.start();

        // main主线程可以继续执行自身逻辑，和MyThread子线程并发运行
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程运行");
            Thread.sleep(1000);
        }
    }
}
