package Sort.QuickSort;

//leetcode 912 排序数组 这个解法也超时，说是要用随机选择pivot来优化
public class QSSolution1 {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        QS(nums,left,right);
        return nums;
    }
    void swap(int[]nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    int partition(int[]nums,int left,int right){
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
        swap(nums,j,left);
        return i;
    }
    void QS(int[]nums,int left,int right){
        if (left>=right){
            return;
        }
        int pivot = partition(nums,left,right);
        QS(nums,left,pivot-1);
        QS(nums,pivot+1,right);
    }
}
