package DataStructure.Stack;

import java.util.ArrayDeque;

class Solution {
    public boolean validateBookSequences(int[] putIn, int[] takeOut) {
        ArrayDeque<Integer>Stack = new ArrayDeque<>();
        int len = putIn.length;
        int j = 0;
        outer:
        for (int i=0;i<len;i++){
            Stack.push(putIn[i]);
            inner:
            while (Stack.peek() == takeOut[j]) {
                Stack.pop();
                j++;
                if (Stack.size() == 0){
                    break inner;
                }
            }
        }
        if (j==len){
            return true;
        }
        return false;
    }
}
