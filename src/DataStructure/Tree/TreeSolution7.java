package DataStructure.Tree;

import utils.Node;

public class TreeSolution7 {
    Node pre,head;
    public Node treeToDoublyList(Node root) {
        if(root == null) {
            return null;
        }
        recur(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    public void recur(Node root){
        if(root==null) {
            return;
        }
        recur(root.left);
        if(pre != null) {
            pre.right = root;
        }else{
            head = root;
        }
        root.left = pre;
        pre = root;
        recur(root.right);
    }
}
