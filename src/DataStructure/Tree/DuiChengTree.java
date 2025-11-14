package DataStructure.Tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DuiChengTree {
    public boolean checkSymmetricTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    //我这个解法还是太拉垮了，这种重复多的应该想到递归
//    public boolean checkSymmetricTree(TreeNode root) {
//        return root == null || recur(root.left, root.right);
//    }
//    boolean recur(TreeNode L, TreeNode R) {
//        if(L == null && R == null) return true;
//        if(L == null || R == null || L.val != R.val) return false;
//        return recur(L.left, R.right) && recur(L.right, R.left);
//    }
    public boolean panduan(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (digui(root.left, root.right)) {
            return true;
        }
        return false;
    }

    public boolean digui(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return digui(left.left, right.right) && digui(left.right, right.left);
    }
}
