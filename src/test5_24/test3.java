package test5_24;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test3 {
    /**
     * 三数之和：找到所有不重复的三元组 [a,b,c] 使 a+b+c=0
     * 力扣 15 题
     */
    public static class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            // 数组为空 或 长度不足3，直接返回空
            if (nums == null || nums.length < 3) {
                return result;
            }

            // 1. 排序（关键：方便去重 + 双指针）
            Arrays.sort(nums);

            // 2. 遍历每个元素作为第一个数
            for (int i = 0; i < nums.length; i++) {
                // 第一个数 > 0，后面不可能凑成 0，直接结束
                if (nums[i] > 0) {
                    break;
                }

                // 去重：当前数和前一个数一样，跳过
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                // 3. 双指针找另外两个数
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        // 找到一组答案
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // 左边去重
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        // 右边去重
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        // 移动指针
                        left++;
                        right--;
                    }
                    // 和太小，左指针右移
                    else if (sum < 0) {
                        left++;
                    }
                    // 和太大，右指针左移
                    else {
                        right--;
                    }
                }
            }
            return result;
        }

        // 测试
        public static void main(String[] args) {
            ThreeSum solution = new ThreeSum();
            int[] nums = {-1, 0, 1, 2, -1, -4};

            List<List<Integer>> ans = solution.threeSum(nums);
            System.out.println(ans);
            // 输出：[[-1, -1, 2], [-1, 0, 1]]
        }
    }
}