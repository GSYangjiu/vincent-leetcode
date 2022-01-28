import model.ListNode;

/**
 * @author Vincent
 * @date 2022/1/29 12:03 上午
 * Email: vincent1094259423@yahoo.com
 * Description：https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Problem2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersRec(l1, l2, 0);
    }

    public ListNode addTwoNumbersRec(ListNode l1, ListNode l2, int temp) {
        if (l1 == null && l2 == null) {
            return temp == 0 ? null : new ListNode(temp);
        } else if (l1 == null) {
            temp = l2.val + temp;
            return new ListNode(temp % 10, addTwoNumbersRec(null, l2.next, temp / 10));
        } else if (l2 == null) {
            temp = l1.val + temp;
            return new ListNode(temp % 10, addTwoNumbersRec(l1.next, null, temp / 10));
        } else {
            temp = l1.val + l2.val + temp;
            return new ListNode(temp % 10, addTwoNumbersRec(l1.next, l2.next, temp / 10));
        }
    }

    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null,tail = null;//头节点，尾结点设为null
        int carry = 0;
        while(l1 != null ||l2 != null){
            int n1= l1!=null ? l1.val : 0;
            int n2= l2!=null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null){//头节点为空,
                head = tail = new ListNode(sum%10);
            }else{
                tail.next = new ListNode(sum%10);
                tail = tail.next;
            }
            carry = sum/10;//进位
            //下一个结点
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if (carry>0){
            tail.next = new ListNode(carry);
        }
        return head;
    }*/
}
