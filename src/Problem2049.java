import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/11 9:48 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 统计最高分的节点数目
 * URL: https://leetcode-cn.com/problems/count-nodes-with-the-highest-score/
 * Description：
 */
public class Problem2049 {
    class Solution {
        long maxScore = 0;
        int cnt = 0;
        int n;
        List<Integer>[] children;

        public int countHighestScoreNodes(int[] parents) {
            n = parents.length;
            children = new List[n];
            for (int i = 0; i < n; i++) {
                children[i] = new ArrayList<>();
            }
            for (int i = 0; i < n; i++) {
                int p = parents[i];
                if (p != -1) {
                    children[p].add(i);
                }
            }
            dfs(0);
            return cnt;
        }

        public int dfs(int node) {
            long score = 1;
            int size = n - 1;
            for (int c : children[node]) {
                int t = dfs(c);
                score *= t;
                size -= t;
            }
            if (node != 0) {
                score *= size;
            }
            if (score == maxScore) {
                cnt++;
            } else if (score > maxScore) {
                maxScore = score;
                cnt = 1;
            }
            return n - size;
        }
    }
}
