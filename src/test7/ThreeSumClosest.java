package test7;
import java.util.Arrays;
public class ThreeSumClosest {

        public int threeSumClosest(int[] nums, int target) {
            // 排序数组
            Arrays.sort(nums);
            int n = nums.length;
            // 初始化最接近的和
            int closest = nums[0] + nums[1] + nums[2];

            // 固定第一个数
            for (int i = 0; i < n - 2; i++) {
                // 跳过重复元素，优化性能
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = n - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    // 当前差值更小，更新结果
                    if (Math.abs(sum - target) < Math.abs(closest - target)) {
                        closest = sum;
                    }
                    // 完全匹配，直接返回最优解
                    if (sum == target) {
                        return target;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return closest;
        }

        // 测试主方法
        public static void main(String[] args) {
            ThreeSumClosest solution = new ThreeSumClosest();
            // 示例1
            int[] nums1 = {-1, 2, 1, -4};
            int target1 = 1;
            System.out.println(solution.threeSumClosest(nums1, target1)); // 输出2

            // 示例2
            int[] nums2 = {0, 0, 0};
            int target2 = 1;
            System.out.println(solution.threeSumClosest(nums2, target2)); // 输出0
        }
    }
