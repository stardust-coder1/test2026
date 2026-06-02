package test5_31;

class test2{
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            // 只要今天比昨天贵，就赚差价
            if (prices[i] > prices[i-1]) {
                max += prices[i] - prices[i-1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr= {2,3,6,7,9,1};
        int max = maxProfit(arr);
        System.out.println(max);

    }
}