package Sort.MergeSort;

public class NormalMS {
    public void merge(int[]nums,int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)/2;
        merge(nums,left,mid);
        merge(nums,mid+1,right);
        int[]tmp = new int[right-left+1];
        for(int k = left;k<=right;k++){
            tmp[k-left]=nums[k];
        }
        int i = 0, j = mid - left + 1;       // 两指针分别指向左/右子数组的首个元素
        for (int k = left; k <= right; k++) {  // 遍历合并左/右子数组
            if (i == mid - left + 1)
                nums[k] = tmp[j++];
            else if (j == right - left + 1 || tmp[i] <= tmp[j])
                nums[k] = tmp[i++];
            else {
                nums[k] = tmp[j++];
            }
        }
    }
}
