import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/3/2 1:02 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 赎金信
 * URL: https://leetcode-cn.com/problems/ransom-note/
 * Description：
 */
public class Problem383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (map.getOrDefault(c, 0) == 0) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        return true;
    }
}
