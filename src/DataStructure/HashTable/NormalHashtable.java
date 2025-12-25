package DataStructure.HashTable;


import java.util.HashMap;
import java.util.Map;

public class NormalHashtable {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"1");
        map.put(11,"11");
        map.put(111,"111");
        boolean a = map.containsKey(1111);
        map.remove(1);
        for(Map.Entry<Integer,String>kv: map.entrySet()){
            System.out.println(kv.getKey()+"->"+kv.getValue());
        }
        for(int key:map.keySet()){
            System.out.println(key);
        }
        for(String value : map.values()){
            System.out.println(value);
        }
    }
}
