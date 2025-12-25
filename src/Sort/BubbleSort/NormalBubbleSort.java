package Sort.BubbleSort;

public class NormalBubbleSort {
    public void BubbleSort (int []array){
        int len = array.length;
        for(int i = 0;i<len-1;i++){
            for (int j=i;j<len-i-1;j++){ //因为冒泡排序每次外循环运送一个最大的到最右边，所以j《len-i-1就行了
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    //还可以添加一个flag，如果哪次内循环没有变位置，那么就排好了
    public void flagBubbleSort (int []array){
        int len = array.length;
        for(int i = 0;i<len-1;i++){
            boolean flag = false;
            for (int j=0;j<len-i-1;j++){ //因为冒泡排序每次外循环运送一个最大的到最右边，所以j《len-i-1就行了
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                return;
            }
        }
    }
}
