/**
 * @author Vincent
 * @date 2022/3/28 4:32 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 设计链表
 * URL: https://leetcode-cn.com/problems/design-linked-list/
 * Description：
 */
public class Problem707 {
    static class MyLinkedList {

        private final Node dummy;
        private int size;

        public MyLinkedList() {
            dummy = new Node();
            size = 0;
        }

        public int get(int index) {
            if (index < 0 || index >= size) return -1;
            Node curr = dummy;
            for (int i = 0; i < index + 1; i++) {
                curr = curr.next;
            }
            return curr.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if (index > size) {
                return;
            }
            Node pred = dummy;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            pred.next = new Node(val, pred.next);
            size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;

            Node pred = dummy;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            pred.next = pred.next.next;
            size--;
        }


        class Node {
            public int val;
            public Node next;

            public Node() {
            }

            public Node(int val) {
                this.val = val;
            }

            public Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);   //链表变为1-> 2-> 3
        linkedList.get(1);            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
    }
}
