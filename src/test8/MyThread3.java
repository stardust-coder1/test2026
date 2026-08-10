package test8;

public class MyThread3 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("继承Thread方式运行");
        }
    }
}
