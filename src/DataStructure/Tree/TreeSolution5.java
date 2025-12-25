package DataStructure.Tree;

import utils.TreeNode;

//leetcode 226 翻转二叉树
//我写的这个递归有点臃肿，官方写法比较简洁，但我觉得我这个比官方写法看起来易懂
public class TreeSolution5 {
    public TreeNode flipTree(TreeNode root) {
        recur(root);
        return root;
    }
    public void recur (TreeNode root){
        if (root==null){
            return;
        }
        TreeNode tempr = root.right;
        TreeNode templ = root.left;
        if(root.left!=null){
            recur(root.left);
        }
        root.left = tempr;
        if(root.right!=null){
            recur(root.right);
        }
        root.right = templ;
    }
}
