package Sort.QuickSort;

public class NormalQS {
    void swap(int[]nums,int i,int j){
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
    public int partition(int[]nums,int left, int right){
        int i = left;
        int j = right;
        while(i<j){
            while(i<j&&nums[j]>=nums[left]){
                j--;
            }
            while(i<j&&nums[i]<=nums[left]){
                i++;
            }
            swap(nums,i,j);
        }
        swap(nums,left,i);
        return i;
    }
    public void quickSort(int[]nums,int left,int right){
        if (left>=right){
            return;
        }
        int pivot = partition(nums, left, right);
        quickSort(nums,left,pivot-1);
        quickSort(nums,pivot+1,right);
    }
}
