package test7;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        // 1. 从后向前找到第一个 nums[i] < nums[i+1] 的下标i
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // 存在更小的高位数字，需要交换
        if (i >= 0) {
            int j = n - 1;
            // 2. 从末尾找第一个比nums[i]大的数
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        // 3. 反转i右侧区间；i=-1时直接反转整个数组
        reverse(nums, i + 1, n - 1);
    }

    // 交换数组两个位置元素
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    // 反转数组 [left, right] 区间
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    // 打印数组工具方法，方便查看结果
    public void printArr(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // main测试入口，IDEA直接运行
    public static void main(String[] args) {
        NextPermutation solution = new NextPermutation();

        // 测试用例1
        int[] nums1 = {1, 2, 3};
        System.out.print("原数组1：");
        solution.printArr(nums1);
        solution.nextPermutation(nums1);
        System.out.print("下一个排列：");
        solution.printArr(nums1);
        System.out.println("——————————");

        // 测试用例2
        int[] nums2 = {3, 2, 1};
        System.out.print("原数组2：");
        solution.printArr(nums2);
        solution.nextPermutation(nums2);
        System.out.print("下一个排列：");
        solution.printArr(nums2);
        System.out.println("——————————");

        // 测试用例3
        int[] nums3 = {2, 3, 1};
        System.out.print("原数组3：");
        solution.printArr(nums3);
        solution.nextPermutation(nums3);
        System.out.print("下一个排列：");
        solution.printArr(nums3);
    }
}
