import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/9 11:06 下午
 * Email: vincent1094259423@yahoo.com
 * Title: Excel 表中某个范围内的单元格
 * URL: https://leetcode-cn.com/problems/cells-in-a-range-on-an-excel-sheet/
 * Description：
 */
public class Problem2194 {
    static class Solution {
        public List<String> cellsInRange(String s) {
            List<String> res = new ArrayList<>();
            String[] strs = s.split(":");
            int[] nums = new int[2];
            char[] chars = new char[2];
            nums[0] = Integer.parseInt(strs[0].substring(1));
            nums[1] = Integer.parseInt(strs[1].substring(1));
            chars[0] = strs[0].charAt(0);
            chars[1] = strs[1].charAt(0);
            for (char i = chars[0]; i <= chars[1]; i++) {
                for (int j = nums[0]; j <= nums[1]; j++) {
                    res.add(i + "" + j);
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.cellsInRange("K1:L1"));
    }
}
