package DataStructure.Stack;

import java.util.ArrayList;
import java.util.Collections;

class MedianFinder {
    private ArrayList<Integer> arrayList;
    public MedianFinder() {
        arrayList = new ArrayList<Integer>();
    }
    public void addNum(int num) {
        arrayList.add(num);
        Collections.sort(arrayList);
    }
    public double findMedian() {
        int len = arrayList.size();
        int halflen = len / 2;
        if (arrayList.size()%2==0){
            return 0.5*(arrayList.get(halflen)+arrayList.get(halflen-1));
        }
        else return arrayList.get(halflen);
    }
}
