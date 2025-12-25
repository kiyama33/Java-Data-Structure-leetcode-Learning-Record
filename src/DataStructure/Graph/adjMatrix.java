package DataStructure.Graph;

import java.util.ArrayList;
import java.util.List;

public class adjMatrix {
    List<Integer>verticles;
    List<List<Integer>>adjMat;
    public adjMatrix(int[]verticles,int[][]edges){//edges的每个子数组只有两个元素，表示起点和终点
        this.verticles = new ArrayList<>();
        this.adjMat = new ArrayList<>();
        for(int val:verticles){
            addVertex(val);
        }
        for(int[]edge:edges){
            addEdge(edge[0],edge[1]);
        }
    }
    public int getsize(){
        return verticles.size();
    }
    public void addVertex(int val){
        int size = getsize();
        verticles.add(val);
        ArrayList<Integer>newrow = new ArrayList<>(size);
        for (int i=0;i<size;i++){
            newrow.add(0);
        }
        adjMat.add(newrow);
        for(List<Integer>row:adjMat){
            row.add(0);
        }
    }
    public void removeVertex(int index){
        if (index>=getsize()){
            throw new IndexOutOfBoundsException();
        }
        verticles.remove(index);
        adjMat.remove(index);
        for(List<Integer>row:adjMat){
            row.remove(index);
        }
    }
    public void addEdge(int i,int j){
        if (i < 0 || j < 0 || i >= getsize() || j >= getsize() || i == j) {
            throw new IndexOutOfBoundsException();
        }
        adjMat.get(i).set(j,1);
        adjMat.get(j).set(i,1);
    }
    public void removeEdge(int i,int j){
        if (i < 0 || j < 0 || i >= getsize() || j >= getsize() || i == j) {
            throw new IndexOutOfBoundsException();
        }
        adjMat.get(i).set(j,0);
        adjMat.get(j).set(i,0);
    }
    public void print(){
        for (int i=0;i<verticles.size();i++){
            for (int j=0;j<verticles.size();j++){
                System.out.print(adjMat.get(i).get(j));
            }
            System.out.println();
        }
    }
}
