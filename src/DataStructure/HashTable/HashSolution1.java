package DataStructure.HashTable;

import java.util.HashMap;
import java.util.Map;

//leetcode 1
//这题挺不错的，需要熟悉Hashmap的一些方法比如containsKey和get方法，还需要熟悉这个用hashmap记录已经遍历过的元素的算法
public class HashSolution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int hubu = target - nums[i];//互补
            if (hashmap.containsKey(hubu)){
                return new int[]{hashmap.get(hubu),i};//为什么不能用别的呢，因为只有hashmap能存两个，tree什么的就能存个元素value
            }
            hashmap.put(nums[i],i);
        }
        return new int[0];
    }
}
