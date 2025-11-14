package DataStructure.Tree;

import utils.TreeNode;

import java.util.ArrayDeque;

public class SolutionShenDu {
    public int calculateDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int count = 0;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0;i<size;i++) {
                TreeNode node = queue.pollFirst();
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
            count++;
        }
        return count;
    }
}
