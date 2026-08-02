package test7;

public class Main {
    public static void main(String[] args) {
        DivideSolution solution = new DivideSolution();

        // 多组测试用例，可自行修改数字测试
        test(solution, 10, 3);      // 预期 3
        test(solution, 7, -3);      // 预期 -2
        test(solution, Integer.MIN_VALUE, -1); // 溢出 2147483647
        test(solution, 0, 5);       // 预期 0
        test(solution, -20, 4);     // 预期 -5
    }

    // 封装打印测试结果
    private static void test(DivideSolution sol, int a, int b) {
        int ans = sol.divide(a, b);
        System.out.printf("%d ÷ %d = %d%n", a, b, ans);
    }
}
