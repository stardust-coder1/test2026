package test_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreSystem {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            //打印菜单，和效果图一模一样
            System.out.println("*************************");
            System.out.println("1.添加学生分数信息");
            System.out.println("2.删除学生分数信息");
            System.out.println("3.所有学生分数信息");
            System.out.println("4.退出系统");
            System.out.println("*************************");
            System.out.print("请选择：");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("请输入学生ID：");
                    int id = sc.nextInt();
                    System.out.print("请输入学生分数：");
                    int score = sc.nextInt();
                    map.put(id,score);
                    System.out.println("学生分数添加成功！");
                    break;
                case 2:
                    System.out.print("请输入删除学生ID：");
                    int delId = sc.nextInt();
                    map.remove(delId);
                    System.out.println("学生分数删除成功！");
                    break;
                case 3:
                    System.out.println("ID\t分数");
                    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                        System.out.println(entry.getKey()+"\t"+entry.getValue());
                    }
                    break;
                case 4:
                    System.out.println("系统退出！");
                    sc.close();
                    return;
                default:
                    System.out.println("选择错误！");
            }
        }
    }
}
