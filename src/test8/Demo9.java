package test8;

public class Demo9 {
    public static void main(String[] args) {
        // 1、继承Thread类，重写run()
        MyThread t1 = new MyThread();
        t1.start();

        // 2、实现Runnable接口，重写run()
        MyRunnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable);
        t2.start();

        //3、继承Thread，匿名内部类
        new Thread(){
            @Override
            public void run() {
                System.out.println("方式3：Thread匿名内部类线程运行");
            }
        }.start();

        //4、实现Runnable，匿名内部类
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("方式4：Runnable匿名内部类线程运行");
            }
        });
        t4.start();

        //5、Lambda表达式（Runnable函数式接口）
        new Thread(()->{
            System.out.println("方式5：Lambda表达式线程运行");
        }).start();
    }
}

//方式1：继承Thread
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("方式1：继承Thread类线程运行");
    }
}

//方式2：实现Runnable接口
class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("方式2：实现Runnable接口线程运行");
    }

}
