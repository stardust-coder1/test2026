package test6_16;
import java.util.Arrays;
public class test1 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        // 初始化最接近的和
        int closest = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // 当前和差值更小，更新结果
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                // 和刚好等于target，直接返回最优解
                if (sum == target) {
                    return sum;
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
        test1 obj = new test1();
        int[] nums1 = {-1, 2, 1, -4};
        System.out.println(obj.threeSumClosest(nums1, 1)); // 输出 2

        int[] nums2 = {0, 0, 0};
        System.out.println(obj.threeSumClosest(nums2, 1)); // 输出 0
    }


}
