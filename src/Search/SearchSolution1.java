package Search;

import java.util.Hashtable;

//LC招式拆解
public class SearchSolution1 {
    public char dismantlingAction(String arr) {
        Hashtable<Character,Integer>hash = new Hashtable<>();
        for (int i =0;i<arr.length();i++){
            if (hash.containsKey(arr.charAt(i))){
                hash.replace(arr.charAt(i),hash.get(arr.charAt(i))+1);
            } else{
                hash.put(arr.charAt(i),1);
            }
        }
        for (int i =0;i<arr.length();i++){
            if(hash.get(arr.charAt(i))==1){
                return arr.charAt(i);
            }
        }
        return ' ';
    }
}
