package DataStructure.Array;

import java.util.ArrayList;
import java.util.List;

//LC文件组合
//官方的数学解法挺难的，不学了，这题的收获是toArray方法的使用和int[] a = tmp.stream().mapToInt(Integer::intValue).toArray();
public class ArraySolution2 {
    public int[][] fileCombination(int target) {
        List<int[]>res = new ArrayList<>();
        int count=0;
        for(int i=1;i<target*0.5+2;i++){
            int sum = 0;
            List<Integer>tmp = new ArrayList<>();
            int index = 0;
            for(int j=i;j<target*0.5+2;j++){
                sum+=j;
                tmp.add(j);
                index++;
                if (sum==target){
                    int[] a = tmp.stream().mapToInt(Integer::intValue).toArray();
                    res.add(a);
                }
                if (sum>target){
                    break;
                }
            }
        }
        int[][] a = res.toArray(new int[0][]);
        return a;
    }
}
