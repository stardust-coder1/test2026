package test7;

public class DivideSolution {
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int INT_MIN = Integer.MIN_VALUE;

    public int divide(int dividend, int divisor) {
        // 唯一溢出场景：最小值除以-1，结果超出int上限
        if (dividend == INT_MIN && divisor == -1) {
            return INT_MAX;
        }

        // 判断结果正负：两个数一正一负则结果为负
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // 全部转为负数运算，规避正数溢出问题，用long承接防止中间计算溢出
        long divd = dividend < 0 ? dividend : -(long) dividend;
        long divs = divisor < 0 ? divisor : -(long) divisor;

        int res = 0;

        // 倍增减法核心循环
        while (divd <= divs) {
            long curDivisor = divs;
            int count = 1;

            // 除数不断翻倍，边界校验防止越界
            while (curDivisor >= INT_MIN - curDivisor && divd <= curDivisor + curDivisor) {
                curDivisor += curDivisor;
                count += count;
            }

            divd -= curDivisor;
            res += count;
        }

        // 恢复正负符号
        return negative ? -res : res;
    }
}
