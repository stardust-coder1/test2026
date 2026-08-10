package test8;

public class Demo3 {
    public static void main(String[] args) {
        MyThread3 t = new MyThread3();
        t.start();//同一个线程只能调用一次start（）
    }
}
