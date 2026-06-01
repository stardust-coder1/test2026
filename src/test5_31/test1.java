package test5_31;

public class test1 {
    public static int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprice = 0;
        for(int i = 0;i<prices.length;i++){
            maxprice = Math.max(maxprice,prices[i]-minprice);
            minprice = Math.min(minprice,prices[i]);

        }
        return maxprice;

    }
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }
}
