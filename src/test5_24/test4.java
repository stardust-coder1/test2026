package test5_24;
import java.util.Arrays;
import java.util.Scanner;

public class test4 {


    /**
     * 最接近的三数之和
     * 给定数组 nums 和目标值 target，返回 三个数之和 最接近 target 的结果
     */
    public static class ThreeSumClosest {
        public int threeSumClosest(int[] nums, int target) {
            // 先排序
            Arrays.sort(nums);
            // 初始化：用前三个数的和当默认值
            int closestSum = nums[0] + nums[1] + nums[2];

            // 遍历每个数作为第一个数
            for (int i = 0; i < nums.length; i++) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int currentSum = nums[i] + nums[left] + nums[right];

                    // 如果当前和更接近，更新结果
                    if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                        closestSum = currentSum;
                    }

                    // 双指针移动规则
                    if (currentSum < target) {
                        left++;  // 和太小，左指针右移
                    } else {
                        right--; // 和太大，右指针左移
                    }
                }
            }
            return closestSum;
        }

        // 测试运行
        public static void main(String[] args) {
            ThreeSumClosest solution = new ThreeSumClosest();
            int[] nums = {-1, 2, 1, -4};
            int target = 1;

            int result = solution.threeSumClosest(nums, target);
            System.out.println("最接近的三数之和：" + result);
            // 输出：2
        }
    }

}
