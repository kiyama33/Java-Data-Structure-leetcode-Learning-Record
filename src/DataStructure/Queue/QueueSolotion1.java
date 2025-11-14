package DataStructure.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

class CQueue {
    private int bookid;
    private ArrayDeque<Integer> book;
    public CQueue() {
        book = new ArrayDeque<Integer>();
    }
    public void appendTail(int value) {
        book.addLast(value);
    }
    public int deleteHead() {
        if (book.size()==0){
            return -1;
        }
        return book.pollFirst();
    }
}
