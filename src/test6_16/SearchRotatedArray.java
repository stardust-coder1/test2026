package test6_16;

public class SearchRotatedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 左区间有序
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // 右区间有序
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchRotatedArray solution = new SearchRotatedArray();
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        System.out.println("示例1结果：" + solution.search(nums1, target1));

        int[] nums2 = {4,5,6,7,0,1,2};
        int target2 = 3;
        System.out.println("示例2结果：" + solution.search(nums2, target2));
    }

}
