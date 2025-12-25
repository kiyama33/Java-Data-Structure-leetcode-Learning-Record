package Sort.SelectionSort;

//leetcode215 也是超时，但解法是对的
public class SSSolution1 {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        for (int i = len-1;i>=len-k;i--){
            int maxIndex = i;
            for (int j = i;j>=0;j--){
                if(nums[maxIndex]<nums[j]){
                    maxIndex=j;
                }
            }
            int temp = nums[maxIndex];
            nums[maxIndex]=nums[i];
            nums[i]=temp;
        }
        return nums[len-k];
    }
}
