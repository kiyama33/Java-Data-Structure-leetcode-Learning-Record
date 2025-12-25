package DataStructure.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BFS {
    public static void main(String[]args){
        int[] vertex = {0,1,2,3};
        int[][] edge = new int[4][];
        edge[0]=new int[]{0,1};
        edge[1]=new int[]{1,2};
        edge[2]=new int[]{2,3};
        edge[3]=new int[]{3,0};
        adjMatrix graph = new adjMatrix(vertex,edge);
        graph.print();
        List<Integer>res=BFSearch(graph,0);
        System.out.print(res);
    }
    public static List<Integer> BFSearch(adjMatrix graph,int start){
        ArrayList<Integer>res = new ArrayList<>();
        ArrayDeque<Integer>queue = new ArrayDeque<>();
        queue.addLast(start);
        while(!queue.isEmpty()){
            int vet = queue.pollFirst();
            for (int col=0;col<graph.getsize();col++){
                if (graph.adjMat.get(vet).get(col)==1&&!res.contains(col)){
                    queue.addLast(col);
                }
                res.add(vet);
            }
        }
        List<Integer> restrue = res.stream().distinct().collect(Collectors.toList());
        return restrue;
    }
}
