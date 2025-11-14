package DataStructure.Queue;


import utils.ListNode;

class MyCircularQueue2 {
    private ListNode head;
    private ListNode tail;
    private int len;
    private int size;
    public MyCircularQueue2(int k) {
        len = k;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }
        ListNode node = new ListNode(value);
        if (head==null){
            head = tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        head = head.next;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return head.val;
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return tail.val;
    }

    public boolean isEmpty() {
        if (size==0){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == len){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
