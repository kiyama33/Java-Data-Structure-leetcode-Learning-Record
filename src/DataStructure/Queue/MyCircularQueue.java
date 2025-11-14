package DataStructure.Queue;

import java.util.ArrayList;

class MyCircularQueue {
    int[] queue ;
    public MyCircularQueue(int k) {
        queue = new int[k];
        for (int i=0;i<k;i++){
            queue[i]=Integer.MIN_VALUE;
        }
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        // 先找到最后一个有效元素的位置（从后往前找第一个非MIN的值）
        int lastValidIndex = -1;
        for (int i = queue.length - 1; i >= 0; i--) {
            if (queue[i] != Integer.MIN_VALUE) {
                lastValidIndex = i;
                break;
            }
        }
        // 从最后一个有效元素开始，依次后移一位（如果有有效元素的话）
        for (int i = lastValidIndex; i >= 0; i--) {
            queue[i + 1] = queue[i];
        }
        // 新元素放在队尾（queue[0]）
        queue[0] = value;
        return true;
    }


    public boolean deQueue() {
        for (int i=queue.length-1;i>=0;i++){
            if (!(queue[i]==Integer.MIN_VALUE)){
                queue[i]=Integer.MIN_VALUE;
                return true;
            }
        }
        return false;
    }

    public int Front() {
        for(int i=queue.length-1;i>=0;i--){
            if (!(queue[i]==Integer.MIN_VALUE)){
                return queue[i];
            }
        }
        return -1;

    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return queue[0];
    }

    public boolean isEmpty() {
        boolean res = true;
        for (int i=0;i<queue.length;i++){
            if (!(queue[i]==Integer.MIN_VALUE)){
                res = false;
            }
        }
        return res;
    }

    public boolean isFull() {
        boolean res = false;
        int count = 0;
        for (int i=0;i<queue.length;i++){
            if (!(queue[i]==Integer.MIN_VALUE)){
                count++;
            }
        }
        if (count == queue.length){
            res = true;
        }
        return res;
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
