package model;

import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/1 1:02 下午
 * Email: vincent1094259423@yahoo.com
 * Description：树节点
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
