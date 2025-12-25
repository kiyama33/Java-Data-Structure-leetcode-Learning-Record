package Sort.BubbleSort;

//leetcode912 排序数组 不出意料地超时了，因为题目要求O（nlogn），只有快速排序，归并排序和heap排序符合
public class BubbleSolution1 {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        for (int i=0;i<len-1;i++){
            boolean flag = false;
            for (int j=0;j<len-i-1;j++){
                if (nums[j]>nums[j+1]) {
                    int temp = nums[j + 1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    flag=true;
                }
            }
            if (!flag){
                return nums;
            }
        }
        return nums;
    }
}
