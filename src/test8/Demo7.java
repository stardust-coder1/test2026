package test8;

public class Demo7 {
    public static void main(String[] args) throws InterruptedException{
        Object object = new Object();
        System.out.println("wait 之前");
        synchronized (object) {
            object.wait();
        }
        System.out.println("wait 之后");
    }

}
