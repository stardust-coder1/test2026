package test5_31;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test5 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 1. 数组排序
        Arrays.sort(nums);
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            // 外层i去重：相同开头数字跳过，避免重复三元组
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // 存入一组答案
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);

                    // 左指针去重
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // 右指针去重
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // 左右同时收缩
                    left++;
                    right--;
                } else if (sum < 0) {
                    // 和太小，左指针右移增大总和
                    left++;
                } else {
                    // 和太大，右指针左移减小总和
                    right--;
                }
            }
        }
        return result;
    }

    // 测试主方法
    public static void main(String[] args) {
         test5 solution = new test5();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = solution.threeSum(nums);
        System.out.println(ans);
        // 输出：[[-1, -1, 2], [-1, 0, 1]]
    }
}


