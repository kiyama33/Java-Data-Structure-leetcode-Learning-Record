package DataStructure.Heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQueueSolution {
    public int[] sortArray(int[] nums) {
        Queue<Integer>PQ = new PriorityQueue<>();
        for (int i = 0;i<nums.length;i++){
            PQ.offer(nums[i]);
        }
        for (int i = 0;i<nums.length;i++){
            nums[i]=PQ.poll();
        }
        return nums;
    }
}
