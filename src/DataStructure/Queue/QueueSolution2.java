package DataStructure.Queue;

import java.util.ArrayDeque;
import java.util.Collections;

class Solution {
    public int[] maxAltitude(int[] heights, int limit) {
        if (heights == null || heights.length == 0 || limit <= 0) {
            return new int[0];
        }
        if (heights.length==1){
            return heights;
        }
        int[] result = new int[heights.length-limit+1];
        ArrayDeque<Integer> queue = new ArrayDeque<>(limit);
        for (int i=0;i<limit;i++){
            queue.addLast(heights[i]);
        }
        result[0] = findMax(queue);
        for (int i=1;i<heights.length-limit+1;i++){
            queue.pollFirst();
            queue.addLast(heights[i+limit-1]);
            result[i] = findMax(queue);
        }
        return result;
    }
    public static int findMax(ArrayDeque<Integer> deque) {
        int max = Integer.MIN_VALUE;
        for (int num : deque) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}