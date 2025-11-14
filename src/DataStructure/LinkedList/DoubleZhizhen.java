package DataStructure.LinkedList;

class Solution {
    public ListNode trainningPlan(ListNode head) {
        ListNode pre = null;
        ListNode temp ;
        while(head!=null) {
            temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}
//public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }