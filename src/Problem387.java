import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/3/2 12:41 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 字符串中的第一个唯一字符
 * URL: https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * Description：
 */
public class Problem387 {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character character : map.keySet()) {
            if (map.get(character) == 1) {
                return s.indexOf(character);
            }
        }
        return -1;
    }
}
