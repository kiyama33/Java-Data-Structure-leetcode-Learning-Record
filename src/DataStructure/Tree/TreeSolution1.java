package DataStructure.Tree;
import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TreeSolution1 {//很需要仔细的，比如node不能写成root，比如不能忘记往res里添加value
    public int[] decorateRecord(TreeNode root) {
        if (root == null){
            return new int[0];
        }
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.pollFirst();
            res.add(node.val);
            if (node.left!=null){
                queue.addLast(node.left);
            }
            if (node.right!=null){
                queue.addLast(node.right);
            }
        }
        int[] a = new int[res.size()];
        for (int i =0;i<res.size();i++){
            a[i] = res.get(i);
        }
        return a;
    }
}
