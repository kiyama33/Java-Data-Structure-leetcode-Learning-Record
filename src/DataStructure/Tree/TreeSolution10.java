package DataStructure.Tree;

import utils.TreeNode;

import java.util.ArrayDeque;

//leetcode 110 判断平衡二叉树
//二叉树深度可以由max（左子树深度，右子树深度）+1递归来算
public class TreeSolution10 {
    public boolean isBalanced(TreeNode root) {
        return recur(root)!=-1;
    }
    public int recur (TreeNode root){
        if(root == null){
            return 0;
        }
        int left = recur(root.left);
        if(left==-1) return -1;
        int right = recur(root.right);
        if(right==-1) return -1;
        return Math.abs(left-right)<2 ? Math.max(left,right)+1:-1;
    }
}
