package DataStructure.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class adjMap {
    Map<Integer, List<Integer>>adjmap;
    public adjMap(int[][]edges){
        adjmap = new HashMap<>();
        for(int[]edge:edges){
            addVertex(edge[0]);
            addVertex(edge[1]);
            addEdge(edge[0],edge[1]);
        }
    }
    public int size(){
        return adjmap.size();
    }
    public void addEdge(int v1,int v2){
        if(!adjmap.containsKey(v1)||!adjmap.containsKey(v2)||v1==v2){
            throw new IllegalArgumentException();
        }
        adjmap.get(v1).add(v2);
        adjmap.get(v2).add(v1);
    }
    public void removeEdge(int v1,int v2){
        if(!adjmap.containsKey(v1)||!adjmap.containsKey(v2)||v1==v2){
            throw new IllegalArgumentException();
        }
        adjmap.get(v1).remove(v2);
        adjmap.get(v2).remove(v1);
    }
    public void addVertex(int val){
        if (adjmap.containsKey(val)){
            return;
        }
        adjmap.put(val,new ArrayList<>());
    }
    public void removeVertex(int val){
        if (!adjmap.containsKey(val)){
            throw new IllegalArgumentException();
        }
        adjmap.remove(val);
        for(List<Integer>list:adjmap.values()){
            list.remove(val);
        }
    }
    public void print(){
        for (Map.Entry<Integer, List<Integer>> pair : adjmap.entrySet()) {
            List<Integer> tmp = new ArrayList<>();
            for (int val : pair.getValue())
                tmp.add(val);
            System.out.println(pair.getKey() + ": " + tmp + ",");
        }
    }
}
