package DataStructure.HashTable;

import java.util.HashMap;
import java.util.Map;

//leetcode217
public class HashSolution2 {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int i=0;i<len;i++){
            if (hashmap.containsKey(nums[i])){ //containsKey比containsValue时间复杂度低！
                return true;
            }
            hashmap.put(nums[i],i);
        }
        return false;
    }
}
//还可以这样写，hashset不允许有重复元素
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<Integer>();
//        for (int x : nums) {
//            if (!set.add(x)) {
//                return true;
//            }
//        }
//        return false;
//    }

