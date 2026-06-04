package test5_31;

public class test4 {

        public static void main(String[] args) {
            // 测试用例1
            int[] nums1 = {1, 3};
            int[] nums2 = {2};
            System.out.println("中位数是: " + findMedianSortedArrays(nums1, nums2)); // 预期 2.0

            // 测试用例2
            int[] nums3 = {1, 2};
            int[] nums4 = {3, 4};
            System.out.println("中位数是: " + findMedianSortedArrays(nums3, nums4)); // 预期 2.5
        }

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums1.length > nums2.length) {
                return findMedianSortedArrays(nums2, nums1);
            }

            int m = nums1.length;
            int n = nums2.length;
            int left = 0, right = m;

            while (left <= right) {
                int mid1 = (left + right) / 2;
                int mid2 = (m + n + 1) / 2 - mid1;

                int L1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
                int L2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
                int R1 = (mid1 == m) ? Integer.MAX_VALUE : nums1[mid1];
                int R2 = (mid2 == n) ? Integer.MAX_VALUE : nums2[mid2];

                if (L1 <= R2 && L2 <= R1) {
                    if ((m + n) % 2 == 1) {
                        return Math.max(L1, L2);
                    } else {
                        return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                    }
                } else if (L1 > R2) {
                    right = mid1 - 1;
                } else {
                    left = mid1 + 1;
                }
            }
            return 0.0;
        }
    }

