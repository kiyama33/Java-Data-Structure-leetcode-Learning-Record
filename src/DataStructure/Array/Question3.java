package DataStructure.Array;

class Solution3 {
    public int[] statisticalResult(int[] arrayA) {
        int[] arrayB = new int[arrayA.length];
        for (int i=0;i<arrayA.length;i++){
            int left = 1;
            for (int j=i+1;j<arrayA.length;j++){
                left = left*arrayA[j];
            }
            int right = 1;
            for (int j=i-1;j>=0;j--){
                right = right*arrayA[j];
            }
            arrayB[i]=left * right;
        }
        return arrayB;
    }
}