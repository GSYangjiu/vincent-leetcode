import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/3/11 3:05 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 设计哈希映射
 * URL: https://leetcode-cn.com/problems/design-hashmap/
 * Description：
 */
public class Problem706 {
    class MyHashMap {

        private int[][] list;
        private final static int size = 10001;

        public MyHashMap() {
            list = new int[size][size];
            for (int[] ints : list) {
                Arrays.fill(ints, -1);

            }
        }

        public void put(int key, int value) {
            int[] nodes = list[hash(key)];
            if (nodes == null) {
                nodes = new int[size];
            }
            nodes[key / size] = value;
        }

        public int get(int key) {
            int[] nodes = list[hash(key)];
            if (nodes == null) {
                return -1;
            } else {
                return nodes[key / size];
            }
        }

        public void remove(int key) {
            int[] nodes = list[hash(key)];
            if (nodes != null) {
                nodes[key/size] = -1;
            }
        }

        private int hash(int key) {
            return key % size;
        }
    }
}
