import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/12 10:50 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 杨辉三角II
 * URL: https://leetcode-cn.com/problems/pascals-triangle-ii/
 * Description：
 */
public class Problem119 {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> ans = new ArrayList<>();
            long pre = 1;
            ans.add(1);
            for (int k = 1; k <= rowIndex; k++) {
                long cur = pre * (rowIndex - k + 1) / k;
                ans.add((int) cur);
                pre = cur;
            }
            return ans;
        }
    }
}
