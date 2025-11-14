package DataStructure.Stack;
class ListNode{
    Object val;
    ListNode next;
    ListNode(Object o){
        this.val = o;
    }
}
class LinkedListStack {
    private ListNode stackPeek;
    private int stackSize = 0;
    public LinkedListStack(){
        stackPeek = null;
    }
    public void push(Object o){
        ListNode temp = stackPeek;
        stackPeek = new ListNode(o);
        stackPeek.next = temp;
        stackSize++;
    }
    public Object pop(){
        Object temp = stackPeek.val;
        stackPeek = stackPeek.next;
        stackSize--;
        return temp;
    }
}
