package test_9;

public class ExpectionDemo {
    public static void main(String[] args) {
        try {
            int arr[]= {1,2,3};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }catch (Exception e){
            System.out.println("捕获到的异常并处理。。。。。。。");
        }finally{
            System.out.println("释放资源");
        }
        System.out.println("11111111111111111");
    }
}
