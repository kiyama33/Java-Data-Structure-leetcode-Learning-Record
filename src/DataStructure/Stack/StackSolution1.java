package DataStructure.Stack;

import java.util.ArrayList;
import java.util.Collections;

class MinStack {
    private ArrayList<Integer> minstack;
    private ArrayList<Integer>help;
    public MinStack() {
        minstack = new ArrayList<Integer>();
        help = new ArrayList<Integer>();
    }
    public void push(int x) {
        minstack.add(x);
        help.add(x);
        Collections.sort(help);
    }
    public void pop() {
        // 取出要删除的栈顶元素
        int removed = minstack.remove(minstack.size() - 1);
        // 若删除的元素是当前最小值（help的第一个元素），则从help中移除
        if (removed == help.get(0)) {
            help.remove(0);
        } else {
            // 若删除的不是最小值，需从help中找到并移除该元素（因为help中可能有重复值）
            for (int i = 0; i < help.size(); i++) {
                if (help.get(i) == removed) {
                    help.remove(i);
                    break;
                }
            }
        }
    }
    public int top() {
        return minstack.get(minstack.size() - 1);
    }
    public int getMin() {
        return help.get(0);
    }
}
