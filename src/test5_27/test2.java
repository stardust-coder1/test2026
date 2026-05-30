package test5_27;
import java.util.ArrayList;
public class test2 {

        public static void main(String[] args) {
            // 你自己给数据
            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int m = 3;
            int[] nums2 = {2, 5, 6};
            int n = 3;

            // 调用合并方法
            int[] result = merge(nums1, m, nums2, n);

            // 输出结果！！！
            for (int num : result) {
                System.out.print(num + " ");
            }
        }

        // 我改造成了 返回 int[] 的版本！
        public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
            ArrayList<Integer> list = new ArrayList<>();
            int i = 0, j = 0;

            while (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    list.add(nums1[i]);
                    i++;
                } else {
                    list.add(nums2[j]);
                    j++;
                }
            }

            while (i < m) list.add(nums1[i++]);
            while (j < n) list.add(nums2[j++]);

            // 把 ArrayList 变成 int 数组
            int[] res = new int[list.size()];
            for (int k = 0; k < res.length; k++) {
                res[k] = list.get(k);
            }

            // 返回数组！！！
            return res;
        }
    }

