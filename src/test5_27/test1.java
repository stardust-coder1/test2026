package test5_27;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    //给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
    //
    //请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
    //
    //注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n
    public void  merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; // 指向 nums1
        int j = 0; // 指向 nums2

        ArrayList<Integer> list = new ArrayList<>();


        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                list.add(nums1[i]);
                i++;
            } else {
                list.add(nums2[j]);
                j++;
            }
        }
        while (i < m) {
            list.add(nums1[i]);
            i++;
        }
        while (j < n) {
            list.add(nums2[j]);
            j++;
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = list.get(k);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }
}
