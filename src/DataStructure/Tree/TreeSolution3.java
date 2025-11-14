package DataStructure.Tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TreeSolution3 {
    public List<List<Integer>> decorateRecord(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {
            return res;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        int shunxu = 0;
        queue.addLast(root);//根节点一定要入队！！！
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pollFirst();
                if (shunxu % 2 == 0) {
                    temp.add(node.val);
                } else {
                    temp.add(0, node.val);//这里很巧妙，只要index为0就可以实现一直插入前面！
                }
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
            res.add(temp);
            shunxu++;
        }
        return res;
    }
}
