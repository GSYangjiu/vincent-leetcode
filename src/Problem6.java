import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/1/31 11:06 上午
 * Email: vincent1094259423@yahoo.com
 * Description：Z字形变换 https://leetcode-cn.com/problems/zigzag-conversion/
 * Note：遍历字符串s 插入每行的数组 通过标识来控制插入方向
 */
public class Problem6 {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        int row = 0;
        String result = "";
        boolean turnFlag = false;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(s.length(), numRows); i++) {
            rows.add(new StringBuilder());
        }

        for (int i = 0; i < s.length(); i++) {
            rows.get(row).append(s.charAt(i));
            //第一行或最后一行 转向
            if (row == 0 || row == numRows - 1) {
                turnFlag = !turnFlag;
            }
            //正向往下 反向往上
            row = turnFlag ? row + 1 : row - 1;
        }

        for (StringBuilder rowStr : rows) {
            result += rowStr;
        }
        return result;
    }
}
