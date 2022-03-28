import java.util.*;

/**
 * @author Vincent
 * @date 2022/3/28 4:27 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 字母异位词分组
 * URL: https://leetcode-cn.com/problems/group-anagrams/
 * Description：
 */
public class Problem49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<String, List<String>>();
            for (String str : strs) {
                char[] array = str.toCharArray();
                Arrays.sort(array);
                String key = new String(array);
                List<String> list = map.getOrDefault(key, new ArrayList<String>());
                list.add(str);
                map.put(key, list);
            }
            return new ArrayList<List<String>>(map.values());
        }
    }
}
