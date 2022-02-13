import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/2/13 12:31 下午
 * Email: vincent1094259423@yahoo.com
 * Title: “气球” 的最大数量
 * URL: https://leetcode-cn.com/problems/maximum-number-of-balloons/
 * Description：
 */
public class Problem1189 {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int res = Integer.MAX_VALUE;
        String target = "balloon";
        for (char c : target.toCharArray()) {
            if (c == 'l' || c == 'o') {
                res = Math.min(res, map.getOrDefault(c, 0) / 2);
            } else {
                res = Math.min(res, map.getOrDefault(c, 0));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Problem1189 problem1189 = new Problem1189();
        System.out.println(problem1189.maxNumberOfBalloons("nlaebolko"));
    }
}
