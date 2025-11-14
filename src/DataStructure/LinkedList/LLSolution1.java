package DataStructure.LinkedList;

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class LLSolution1 {
    public int[] reverseBookList(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(head!=null){
            count++;
            head = head.next;
        }
        int[]result = new int[count];
        while(temp!=null){
            result[count-1] = temp.val;
            temp = temp.next;
            count--;
        }
        return result;
    }
}
//void recur(ListNode head) {
//        if(head == null) return;
//        recur(head.next);
//        tmp.add(head.val);
//    }
//
//作者：Krahets
//链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/lh2xpc/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。 递归让head到最后的方法，不错，O(n)
