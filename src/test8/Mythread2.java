package test8;

public class Mythread2 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("【子线程】hello thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
