package DataStructure.LinkedList;
import utils.ListNode;
// leetcode 141
public class KuaiManZhiZhen {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast.equals(slow)){
                return true;
            }
        }
        return false;
    }
}//感觉重要的是哪些不能为null这些条件
//
// 另有无赖解法
// public boolean hasCycle(ListNode head) {
//        while (head!=null && head.next!=null){
//            head.val=Integer.MAX_VALUE;
//            head=head.next;
//            if (head.val==Integer.MAX_VALUE){
//                return true;
//            }
//        }
//        return false;
//    }
