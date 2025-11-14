package DataStructure.Array;

/*class Solution {
    public int[] trainingPlan(int[] actions) {
        List<Integer>result = new ArrayList<>();
        for (int i = 0; i < actions.length; i++) {
            if (actions[i] % 2 == 1) {
                result.add(actions[i]);
            }
        }
        for (int i = 0; i < actions.length; i++) {
            if (actions[i] % 2 == 0) {
                result.add(actions[i]);
            }
        }
        int[] Arrayresult = new int[actions.length];
        for (int i=0;i<actions.length;i++){
            Arrayresult[i] = result.get(i);
        }
        return Arrayresult;
    }
}// 我写得代码，第一次在力扣提交的，虽然对了，但是时间复杂度好高啊，看看示例代码吧
 */
class Solution {
    public int[] trainingPlan(int[] actions) {
        int[] ans = new int[actions.length];
        int left = 0;
        int right = actions.length - 1;
        for (int action : actions) {
            if (action % 2 != 0) {
                ans[left++] = action;
            } else {
                ans[right--] = action;
            }
        }
        return ans;
    }
}//它的是双指针思想，当一次遍历可以解决时用双指针比较高效
