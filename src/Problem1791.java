/**
 * @author Vincent
 * @date 2022/2/18 5:00 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 找出星型图的中心节点
 * URL: https://leetcode-cn.com/problems/find-center-of-star-graph/
 * Description：
 */
public class Problem1791 {
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}
