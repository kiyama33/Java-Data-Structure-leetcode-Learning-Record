package DataStructure.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

//堆是一个特殊的完全二叉树，其中小顶堆节点value小于子节点，反之亦然，在java中heap用优先队列实现,
public class normalHeap {
    public static void main(String[]args){
        Queue<Integer> minheap = new PriorityQueue<>();
        Queue<Integer> maxheap = new PriorityQueue<>((a,b)->b-a);//后面这个是lambda表达式，在后面这个式子<0的情况下和前面一样排列
        maxheap.offer(1);//也可以用add方法，不过add在添加元素失败抛出异常，offer是返回个boolean false；
        maxheap.offer(11);// O（logn）
        maxheap.offer(11111);
        maxheap.offer(1111);
        int peek = maxheap.peek(); //peek = 11111 O(1)
        peek = maxheap.poll(); // 11111 O(logn)
        peek = maxheap.poll(); // 1111
        peek = maxheap.poll(); // 111
        peek = maxheap.poll(); // 11
        peek = maxheap.poll(); // 1
        int size = maxheap.size();
        boolean isempty = maxheap.isEmpty();
        Queue<Integer> anotherheap = new PriorityQueue<>(Arrays.asList(1, 3, 2, 5, 4));//也可以根据列表建堆
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        Queue<Integer> anotherheap1 = new PriorityQueue<>(arrayList);
    }
}
