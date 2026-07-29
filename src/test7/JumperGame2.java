package test7;

public class JumperGame2 {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0; // 只有一个元素，不用跳
        int step = 0; // 记录跳跃总次数
        int curMax = 0; // 当前跳跃区间能到达的最远距离
        int nextMax = 0; // 下一次跳跃能到达的最远距离

        for(int i = 0; i < n - 1; i++){
            // 更新下一步最远可达位置
            nextMax = Math.max(nextMax, i + nums[i]);
            // 走到当前区间尽头，必须跳一次
            if(i == curMax){
                step++;
                curMax = nextMax;
                // 已经能跳到终点，提前退出循环
                if(curMax >= n - 1) break;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        JumperGame2 obj = new JumperGame2();
        int[] arr1 = {2,3,1,1,4};
        System.out.println(obj.jump(arr1)); // 输出2
    }
}
