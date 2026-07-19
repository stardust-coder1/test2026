package test7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 类名统一为Threesum（和代码内保持一致）
public class Threesum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // 当前i已经是正数，后面不可能凑和为0
            if (nums[i] > 0) break;
            // 跳过重复的i，避免重复三元组
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 正确去重：先移动指针，再判断重复
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // 实例化类名和定义的Threesum保持一致
        Threesum solution = new Threesum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = solution.threeSum(nums);
        System.out.println(ans);
        // 输出：[[-1, -1, 2], [-1, 0, 1]]
    }
}