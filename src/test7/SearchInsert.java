package test7;

public class SearchInsert {
    public static void main(String[] args) {
        SearchInsert solution = new SearchInsert();
        // 测试用例1
        int[] nums1 = {1,3,5,6};
        int target1 = 5;
        System.out.println("输入：[1,3,5,6] target=5 输出：" + solution.searchInsert(nums1, target1));

        // 测试用例2
        int[] nums2 = {1,3,5,6};
        int target2 = 2;
        System.out.println("输入：[1,3,5,6] target=2 输出：" + solution.searchInsert(nums2, target2));

        // 测试用例3
        int[] nums3 = {1,3,5,6};
        int target3 = 7;
        System.out.println("输入：[1,3,5,6] target=7 输出：" + solution.searchInsert(nums3, target3));
    }

    /**
     * 二分查找核心方法
     * @param nums 升序排序数组
     * @param target 目标值
     * @return 目标下标 / 插入位置
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            // 防整数溢出写法
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // 未找到时left就是插入位置
        return left;
    }
}
