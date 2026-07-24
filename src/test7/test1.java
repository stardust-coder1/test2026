package test7;

public class test1 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // 原地哈希：把数字放到对应下标位置
        for (int i = 0; i < n; i++) {
            // 数字范围1~n 且未归位，持续交换
            while (nums[i] >= 1 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // 查找第一个缺失的最小正整数
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        // 1~n全部齐全，返回n+1
        return n + 1;
    }

    // main方法：IDEA运行入口，测试三组样例
    public static void main(String[] args) {
        // 修正：当前类是test1，实例化test1对象
        test1 obj = new test1();

        // 测试示例1
        int[] nums1 = {1, 2, 0};
        System.out.println("输入[1,2,0] 输出：" + obj.firstMissingPositive(nums1)); // 3

        // 测试示例2
        int[] nums2 = {3, 4, -1, 1};
        System.out.println("输入[3,4,-1,1] 输出：" + obj.firstMissingPositive(nums2)); // 2

        // 测试示例3
        int[] nums3 = {7, 8, 9, 11, 12};
        System.out.println("输入[7,8,9,11,12] 输出：" + obj.firstMissingPositive(nums3)); // 1
    }
}