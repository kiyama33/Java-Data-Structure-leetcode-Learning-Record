package DataStructure.LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class LLSolution5 {
    ArrayList<Integer> a = new ArrayList<Integer>();
    public ListNode trainningPlan(ListNode l1, ListNode l2) {
        recur(l1);
        recur(l2);
        Collections.sort(a);
        if (a.size()==0){
            return null;
        }
        ListNode newhead = new ListNode(a.get(0));
        ListNode result = newhead;
        for (int i=1;i<a.size();i++){
            newhead.next = new ListNode(a.get(i));
            newhead=newhead.next;
        }
        return result;
    }
    void recur(ListNode head){
        if (head==null){
            return;
        }
        a.add(head.val);
        recur(head.next);
    }
}
