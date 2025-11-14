package DataStructure.LinkedList;

import java.util.ArrayList;

public class LLSolution4 {
    ArrayList<ListNode> a = new ArrayList<>();

    public ListNode trainingPlan(ListNode head, int cnt) {
        recur(head); // 倒序收集节点到a中
        // 直接返回a中第cnt-1个元素（原链表倒数第cnt个节点）
        return a.get(cnt - 1);
    }
    void recur(ListNode head) {
        if (head == null) {
            return;
        }
        recur(head.next); // 先递归到末尾
        a.add(head); // 从后往前添加节点，a中顺序为[8,7,4,2]（示例1）
    }
}
