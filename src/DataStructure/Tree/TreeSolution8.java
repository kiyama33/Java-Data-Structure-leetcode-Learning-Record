package DataStructure.Tree;

import utils.TreeNode;

import java.util.ArrayList;

public class TreeSolution8 {
    public int findTargetNode(TreeNode root, int cnt) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        recur(root,arrayList);
        return arrayList.get(arrayList.size()-cnt);
    }
    public void recur(TreeNode root, ArrayList<Integer>res){
        if (root == null){
            return;
        }
        if (root.left!=null){
            recur(root.left,res);
        }
        res.add(root.val);
        if (root.right!=null){
            recur(root.right,res);
        }
    }
}
