import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Vincent
 * @date 2022/3/14 11:36 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 图像渲染
 * URL: https://leetcode-cn.com/problems/flood-fill/
 * Description：
 */
public class Problem733 {
    class Solution {
        class Node {
            public int x;
            public int y;

            public Node(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        private final Stack<Node> stack = new Stack<>();
        private int m;
        private int n;

        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            m = image.length;
            n = image[0].length;
            int[][] cache = new int[m][n];
            cache[sr][sc] = 1;
            stack.push(new Node(sr, sc));
            while (!stack.isEmpty()) {
                check(cache, image, stack.pop());
            }
            for (int i = 0; i < cache.length; i++) {
                for (int j = 0; j < cache[i].length; j++) {
                    if (cache[i][j] == 1) {
                        image[i][j] = newColor;
                    }
                }
            }
            return image;
        }

        private void check(int[][] cache, int[][] image, Node node) {
            int x = node.x;
            int y = node.y;
            int curColor = image[x][y];

            if (x + 1 < m && cache[x + 1][y] != 1 && image[x + 1][y] == curColor) {
                cache[x + 1][y] = 1;
                stack.push(new Node(x + 1, y));
            }
            if (x - 1 >= 0 && cache[x - 1][y] != 1 && image[x - 1][y] == curColor) {
                cache[x - 1][y] = 1;
                stack.push(new Node(x - 1, y));
            }
            if (y + 1 < n && cache[x][y + 1] != 1 && image[x][y + 1] == curColor) {
                cache[x][y + 1] = 1;
                stack.push(new Node(x, y + 1));
            }
            if (y - 1 >= 0 && cache[x][y - 1] != 1 && image[x][y - 1] == curColor) {
                cache[x][y - 1] = 1;
                stack.push(new Node(x, y - 1));
            }
        }
    }

    //代码优化
    class Solution1 {
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, 1, -1, 0};

        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int currColor = image[sr][sc];
            if (currColor == newColor) {
                return image;
            }
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{sr, sc});
            image[sr][sc] = newColor;
            while (!queue.isEmpty()) {
                int[] node = queue.poll();
                int x = node[0];
                int y = node[1];

                for (int i = 0; i < 4; i++) {
                    int mx = x + dx[i], my = y + dy[i];
                    if (mx >= 0 && mx < image.length && my >= 0 && my < image[0].length && image[mx][my] == currColor) {
                        queue.offer(new int[]{mx, my});
                        image[mx][my] = newColor;
                    }
                }
            }
            return image;
        }
    }
}
