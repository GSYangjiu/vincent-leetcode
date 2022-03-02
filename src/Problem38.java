/**
 * @author Vincent
 * @date 2022/3/2 6:03 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 外观数列
 * URL: https://leetcode-cn.com/problems/count-and-say/
 * Description：
 */
public class Problem38 {
    static class Solution {

        public String countAndSay(int n) {
            String res = "1";
            for (int i = 1; i < n; i++) {
                res = getStr(res);
            }
            return res;
        }

        public String getStr(String n) {
            StringBuilder res = new StringBuilder();
            char[] chars = n.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                int count = 1;
                while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                    i++;
                    count++;
                }
                res.append(count + "" + chars[i]);
            }
            return res.toString();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(4));
    }
}
