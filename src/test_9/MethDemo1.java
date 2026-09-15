package test_9;

public class MethDemo1 {
    public static void add (int n){
        int num = 0;
        for (int i = 0; i <n ; i++) {
            num +=i;

        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        add(8);
    }
}
