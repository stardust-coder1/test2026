package test5_26;

public class test3 {
    static class MyBox<T>{
        private T data;
        public void setData(T data){
            this.data = data;
        }
        public T getData() {
            return data;
        }
        // 泛型静态方法
        public static <E> void printArray(E[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        //定义一个泛型工具类 MyBox<T>，表示一个容器，要求：
        //私有成员变量 T data；
        //提供 setData(T data) 赋值方法；
        //提供 T getData() 取值方法。
        //在 main 方法中：
        //创建 MyBox<String> 对象，存入字符串 Hello 泛型，并取出打印；
        //创建 MyBox<Integer> 对象，存入数字 100，并取出打印。
        //额外拓展：再写一个泛型静态方法，可以接收任意类型数组，遍历并打印数组所有元素。
        // 使用泛型类，存储字符串
        MyBox<String> strBox = new MyBox<>();
        strBox.setData("Hello 泛型");
        System.out.println("字符串容器取值：" + strBox.getData());

        // 使用泛型类，存储整数
        MyBox<Integer> intBox = new MyBox<>();
        intBox.setData(100);
        System.out.println("数字容器取值：" + intBox.getData());

        // 调用泛型静态方法，打印数组
        String[] strArr = {"Java", "ArrayList", "HashMap"};
        Integer[] intArr = {1, 2, 3, 4, 5};
        System.out.print("字符串数组：");
        MyBox.printArray(strArr);
        System.out.print("数字数组：");
        MyBox.printArray(intArr);


    }
}
