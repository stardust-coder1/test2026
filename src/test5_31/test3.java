package test5_31;

public class test3 {
    static class  Solution {
        public String longestCommonPrefix(String[] strs) {
            // 空数组
            if (strs == null || strs.length == 0) {
                return "";
            }
            String prefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                // 当前字符串不以prefix开头，不断削去最后一位
                while (!strs[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    // 无公共前缀
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }
            return prefix;
        }

        // 测试
        public static void main(String[] args) {
            Solution sol = new Solution();
            System.out.println(sol.longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // fl
            System.out.println(sol.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));  // ""
        }
    }
}

