import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/1/29 11:41 上午
 * Email: vincent1094259423@yahoo.com
 * Description：
 */
public class Problem3 {
    public static int lengthOfLongestSubstring(String s) {
        if ("".equals(s)) return 0;
        if (s.length() == 1) return 1;
        int max = 0;
        List<Character> tempList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            //暂存队列中存在strs[i]，移除首位元素 直到队列中不包含重复元素
            while (tempList.contains(s.charAt(i))) {
                tempList.remove(0);
            }
            tempList.add(s.charAt(i));
            max = Math.max(tempList.size(), max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("cdvdf"));
    }
}
