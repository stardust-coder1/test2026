package test7;

public class TrapRainWater {
    public int trap(int[] height) {
        int len = height.length;
        if (len == 0) return 0;

        int[] leftMax = new int[len];  // leftMax[i]: i左侧最大高度
        int[] rightMax = new int[len]; // rightMax[i]: i右侧最大高度
        int totalWater = 0;

        // 正向遍历：填充左侧最大值
        leftMax[0] = height[0];
        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // 反向遍历：填充右侧最大值
        rightMax[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // 计算总雨水
        for (int i = 0; i < len; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return totalWater;
    }

    public static void main(String[] args) {
        TrapRainWater obj = new TrapRainWater();
        // 测试示例1
        int[] arr1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(obj.trap(arr1)); // 输出6
        // 测试示例2
        int[] arr2 = {4,2,0,3,2,5};
        System.out.println(obj.trap(arr2)); // 输出9
    }
}
