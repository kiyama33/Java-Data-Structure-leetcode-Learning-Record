package DataStructure.LinkedList;

public class LLSolution2 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode temp = head.next;
        ListNode result = head;
        while(temp!=null){
            if (temp.val==val){
                head.next = temp.next;
                break;
            }
            head = head.next;
            temp = temp.next;
        }
        return result;
    }
}
