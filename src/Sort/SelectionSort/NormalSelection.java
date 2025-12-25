package Sort.SelectionSort;

public class NormalSelection {
    public void selectionsort(int[] array){
        int len = array.length;
        for(int i = 0;i<len;i++){
            int minIndex = i;
            for(int j=i;j<len;j++){
                if (array[minIndex]>array[j]){
                    minIndex = j;
                }
            }
            int tmp = array[minIndex];
            array[minIndex]=array[i];
            array[i]=tmp;
        }
    }
}
