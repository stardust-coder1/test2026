package test5_26;

import java.util.ArrayList;

public class test1 {
    //创建一个 ArrayList<String> 集合，存入 5 个学生姓名：张三、李四、王五、赵六、钱七。
    //遍历集合，打印所有元素（使用普通 for 循环，不使用增强 for）。
    //将索引为 2 的元素修改为 小明。
    //删除元素 赵六。
    //再次遍历集合，输出最终结果。
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("钱七");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        //修改索引为2 的元素
        list.set(2,"小明");
        list.remove("赵六");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(String name:list){
            System.out.println(name);
        }
    }
}
