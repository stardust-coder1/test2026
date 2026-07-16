package test6_16;

import java.util.ArrayList;
import java.util.List;

public class SievePrime {
    public static List<Integer> getPrimeLessThan(int n) {
        List<Integer> ans = new ArrayList<>();
        if (n <= 2) return ans;

        boolean[] isPrime = new boolean[n];
        // 初始化：默认所有数是质数
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // 标记 i 的倍数为合数
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 收集所有质数
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 30;
        List<Integer> list = getPrimeLessThan(num);
        System.out.println("小于" + num + "的质数：" + list);
    }
}