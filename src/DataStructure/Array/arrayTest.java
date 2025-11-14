package DataStructure.Array;

import java.util.ArrayList;
import java.util.List;

public class arrayTest {
    List<Character> array = new ArrayList<>();
    public arrayTest (){
        array.add('a');
        array.add('b');
        array.add(1,'z');
        array.remove(1);
        array.set(1,'y');
        for (char c:array){
            System.out.println(c);
        } //iterate
        boolean contains = array.contains('a'); //contain?
    }
}//这个List<Integer> 本身是接口，无法直接实例化，必须使用它的实现类，最常用的实现类是：ArrayList（最常用）：底层基于动态数组实现（连续内存空间）。
//优势：随机访问效率高（通过索引直接定位，时间复杂度 O(1)）。
//劣势：中间插入 / 删除元素效率低（需要移动后续元素，时间复杂度 O(n)）。

