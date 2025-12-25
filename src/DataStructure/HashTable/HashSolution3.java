package DataStructure.HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//leetcode448
public class HashSolution3 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> hash = new HashSet<>();
        for (int i=0;i<len;i++){
            hash.add(nums[i]);
        }
        for (int i=1;i<len+1;i++){
            if (hash.add(i)){
                res.add(i);
            }
        }
        return res;
    }
}
