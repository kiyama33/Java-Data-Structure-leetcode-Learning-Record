package DataStructure.HashTable;

import java.util.HashMap;
import java.util.Map;

//leetcode 383 赎金信
public class HashSolution4 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length()>magazine.length()){
            return false;
        }
        Map<Character,Integer> hashmap = new HashMap<>();
        for (int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            hashmap.put(c,hashmap.getOrDefault(c,0)+1);//重点是这个getOrDefault方法
        }
        for (int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if (!hashmap.containsKey(c)||hashmap.get(c)==0){
                return false;
            }else {
                hashmap.replace(c, hashmap.get(c) - 1);
            }
        }
        return true;
    }
}
