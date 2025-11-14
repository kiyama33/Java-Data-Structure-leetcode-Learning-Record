package DataStructure.Tree;

import utils.TreeNode;

import java.util.ArrayList;

//实际上用内置的TreeSet boolean exists = treeSet.contains(target) 这个只是学习原理
public class BinarySearch {
    private TreeNode root;
    public boolean search(int target){
        TreeNode cur = root;
        while (cur!=null) {
            if (target < cur.val) {
                cur = cur.left;
            }else if (target>cur.val){
                cur = cur.right;
            }else {
                return true;
            }
        }
        return false;
    }
    //二叉搜索树插入的新节点一定是叶子节点 有序数组插入空树可能反而不好，会退化为链表
    public void insert(int val){
        TreeNode target = new TreeNode(val);
        if (root==null){
            root = target;
        }
        TreeNode current = root;
        TreeNode parent = null;
        while(current!=null){
            parent = current;
            if (target.val<current.val){
                current = current.left;
            }else if (target.val>current.val){
                current = current.right;
            }else return;
        }
        if (target.val<parent.val){
            parent.left = target;
        }else if (target.val>parent.val){
            parent.right = target;
        }
    }
    //二叉搜索树的中序搜索一定是有序的，所以二叉搜索树删除节点的算法是，把中序搜索的下一个节点给换到要删除的这个节点的位置就好了
    public void remove(int num) {
        // 若树为空，直接提前返回
        if (root == null)
            return;
        TreeNode cur = root, pre = null;
        // 循环查找，越过叶节点后跳出
        while (cur != null) {
            // 找到待删除节点，跳出循环
            if (cur.val == num)
                break;
            pre = cur;
            // 待删除节点在 cur 的右子树中
            if (cur.val < num)
                cur = cur.right;
                // 待删除节点在 cur 的左子树中
            else
                cur = cur.left;
        }
        // 若无待删除节点，则直接返回
        if (cur == null)
            return;
        // 子节点数量 = 0 or 1
        if (cur.left == null || cur.right == null) {
            // 当子节点数量 = 0 / 1 时， child = null / 该子节点
            TreeNode child = cur.left != null ? cur.left : cur.right;
            // 删除节点 cur
            if (cur != root) {
                if (pre.left == cur)
                    pre.left = child;
                else
                    pre.right = child;
            } else {
                // 若删除节点为根节点，则重新指定根节点
                root = child;
            }
        }
        // 子节点数量 = 2
        else {
            // 获取中序遍历中 cur 的下一个节点
            TreeNode tmp = cur.right;
            while (tmp.left != null) {
                tmp = tmp.left;
            }
            // 递归删除节点 tmp
            remove(tmp.val);
            // 用 tmp 覆盖 cur
            cur.val = tmp.val;
        }
    }
}
