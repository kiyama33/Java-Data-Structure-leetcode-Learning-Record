package DataStructure.LinkedList;

import java.util.ArrayList;

public class LLSolution3 {
    ArrayList<Integer> a = new ArrayList();
    public ListNode trainningPlan(ListNode head) {
        recur(head);
        if (a.isEmpty()) {
            return null;
        }
        ListNode result = new ListNode(a.get(0));
        ListNode current = result;
        for (int i = 1; i < a.size(); i++) {
            current.next = new ListNode(a.get(i)); // 下一个节点
            current = current.next; // 移动指针到新节点
        }
        return result;
    }
    void recur(ListNode head) {
        if (head==null){
            return;
        }
        recur(head.next);
        a.add(head.val);
    }
}//我的难看解法，但是学会了如何通过一个数组创建一个新链表

//八股文：
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode newHead = null;
//        for (; head != null;) {
//            ListNode tmp = head.next;
//            head.next = newHead;
//            newHead = head;
//            head = tmp;
//        }
//        return newHead;
//    }
//}

//纯纯递归解法：
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        return digui(head,null);
//    }
//
//    private ListNode digui(ListNode head, ListNode pre) {
//        if(head==null){
//            return pre;
//        }
//        ListNode res = digui(head.next, head);
//        head.next=pre;
//        return res;
//    }
//}
