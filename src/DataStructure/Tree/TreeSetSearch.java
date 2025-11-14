package DataStructure.Tree;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetSearch {
    public static void main(String[] args){
        int[] array = {12,23,45,1,2,3,97};
        TreeSet<Integer> search = new TreeSet();
        for (int num:array){
            search.add(num);
        }
        int target = 12;
        boolean exists = search.contains(target);
    }
}
