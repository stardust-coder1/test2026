package test6_16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test2 {



        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            int n = nums.length;

            // 固定第一个数i
            for (int i = 0; i < n - 3; i++) {
                // i层去重
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                // 固定第二个数j
                for (int j = i + 1; j < n - 2; j++) {
                    // j层去重
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                    int left = j + 1;
                    int right = n - 1;
                    while (left < right) {
                        // long防止int数值溢出
                        long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum == target) {
                            res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            // 跳过左侧重复
                            while (left < right && nums[left] == nums[left + 1]) left++;
                            // 跳过右侧重复
                            while (left < right && nums[right] == nums[right - 1]) right--;
                            left++;
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
            return res;
        }

        // main运行入口
        public static void main(String[] args) {
            test2 solution = new test2();

            // 测试用例1
            int[] nums1 = {1,0,-1,0,-2,2};
            int target1 = 0;
            System.out.println("示例1结果：" + solution.fourSum(nums1, target1));

            // 测试用例2
            int[] nums2 = {2,2,2,2,2};
            int target2 = 8;
            System.out.println("示例2结果：" + solution.fourSum(nums2, target2));
        }
    }

