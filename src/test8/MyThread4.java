package test8;

public class MyThread4 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("我想睡觉");

        }
    }

}
