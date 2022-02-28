import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/2/28 9:50 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 杨辉三角
 * URL: https://leetcode-cn.com/problems/pascals-triangle/
 * Description：
 */
public class Problem118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {

            List<Integer> preList = res.get(i - 1);
            List<Integer> curList = new ArrayList<>();
            curList.add(1);
            for (int j = 1; j < preList.size(); j++) {
                curList.add(preList.get(j - 1) + preList.get(j));
            }
            curList.add(1);
            res.add(curList);
        }
        return res;
    }
}
