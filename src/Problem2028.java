/**
 * @author Vincent
 * @date 2022/3/27 4:10 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 找出缺失的观测数据
 * URL: https://leetcode-cn.com/problems/find-missing-observations/
 * Description：
 */
public class Problem2028 {
    class Solution {
        public int[] missingRolls(int[] rolls, int mean, int n) {
            int[] res = new int[n];
            int m = rolls.length;
            int totalM = 0;
            for (int num : rolls) {
                totalM += num;
            }
            int total = mean * (m + n) - totalM;
            if (total < n || total > 6 * n) {
                return new int[0];
            }
            for (int i = 0; i < n - 1; i++) {
                int temp = 1;
                while ((total - temp) > (6 * (n - i - 1))){
                    temp++;
                }
                total -= temp;
                res[i] = temp;
            }
            res[n - 1] = total;
            return res;
        }
    }
}
