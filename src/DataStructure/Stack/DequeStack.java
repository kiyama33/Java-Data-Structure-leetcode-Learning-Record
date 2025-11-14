package DataStructure.Stack;

import java.util.ArrayDeque;

public class DequeStack {
    private ArrayDeque<Integer> stack;
    public DequeStack(){
        stack = new ArrayDeque<Integer>();
    }
    public void push(int x){
        stack.push(x);
    }
    public static void main(String[] args){
        DequeStack stack = new DequeStack();
        stack.push(1);
    }
}
