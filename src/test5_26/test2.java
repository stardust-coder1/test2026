package test5_26;

import java.util.HashMap;
import java.util.Set;

public class test2 {
    public static void main(String[] args) {
        //二、题目 2：HashMap 练习（键值对存储、查询、遍历）
        //题目要求
        //
        //创建 HashMap<Integer, String>，键存学生编号，值存学生姓名。
        //添加数据：1=张三，2=李四，3=王五，4=赵六。
        //根据键 3 获取对应姓名并打印。
        //判断集合中是否包含键 5，给出提示。
        //使用普通循环 + keySet方式遍历整个 Map，打印所有键和值。
        HashMap<Integer,String>map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");
        String name = map.get(3);
        System.out.println(name);
        //判断是否包含键5
        if (map.containsKey(5)) {
            System.out.println("集合中存在编号5");
        } else {
            System.out.println("集合中不存在编号5");
        }
        Set<Integer>set = map.keySet();
        Integer[] arr = set.toArray(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(map.get(arr[i]) );

        }



    }
}
