package test8;

public class Demo6 {

        public static void main(String[] args) throws InterruptedException {
            Thread t = new Thread(() -> {
                for (int i = 0; i < 3000; i++) {
                    System.out.println("hello thread");
                    try {
                        Thread.sleep(1000); // 子线程每次休眠1秒
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("t 线程结束");
            });

            t.start();
            t.join(); // main线程等待线程t，最多等待3000ms
            System.out.println("main 线程结束");
        }
    }

