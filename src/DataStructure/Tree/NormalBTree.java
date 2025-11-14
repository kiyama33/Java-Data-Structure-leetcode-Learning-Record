package DataStructure.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class NormalBTree {
    int val;
    NormalBTree left;
    NormalBTree right;
    NormalBTree(int val){
        this.val=val;
        left = null;
        right = null;
    }
    public static void main(String[] args){
        // <editor-fold desc="一个三层完美二叉树的定义，还有一点增删 "
        NormalBTree n1 = new NormalBTree(1);
        NormalBTree n2 = new NormalBTree(2);
        NormalBTree n3 = new NormalBTree(3);
        NormalBTree n4 = new NormalBTree(4);
        NormalBTree n5 = new NormalBTree(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        // 增加n6为n2的left，n6的子节点为n4和n5：
        NormalBTree n6 = new NormalBTree(6);
        n2.left = n6;
        n6.left = n4;
        n6.right = n5;
        // 现在删掉n6 并且做成一个完美的三层的二叉树
        n2.left = n4;
        n2.right = n5;
        n6.left = n6.right = null;
        n3.left = n6;
        n3.right = new NormalBTree(7);

        // </editor-fold>
    }
    // 层次遍历，基于广度优先搜索
    public List CengCiBianLi(NormalBTree root){
        ArrayDeque<NormalBTree> queue = new ArrayDeque<>();
        List<NormalBTree> res = new ArrayList<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            NormalBTree node = queue.pollFirst();
            if (node.left!=null){
                queue.addLast(node.left);
            }
            if (node.right!=null){
                queue.addLast(node.right);
            }
            res.add(node);
        }
        return res;
    }
    //三种基于深度优先搜索的遍历：都用递归完成
    public void  XianXu(NormalBTree root,List<Object> list){
        if (root == null){
            return ;
        }
        list.add(root.val);//list应该写在这个遍历方法的外面
        if (root.left!=null){
            XianXu(root.left,list);
        }
        if(root.right!=null){
            XianXu(root.right,list);
        }
    }

    public void  MiddleXu(NormalBTree root,List<Object> list){
        if (root == null){
            return ;
        }
        if (root.left!=null){
            MiddleXu(root.left,list);
        }
        list.add(root.val);//list应该写在这个遍历方法的外面
        if(root.right!=null){
            MiddleXu(root.right,list);
        }
    }

    public void  HouXu(NormalBTree root,List<Object> list){
        if (root == null){
            return ;
        }
        if (root.left!=null){
            HouXu(root.left,list);
        }
        if(root.right!=null){
            HouXu(root.right,list);
        }
        list.add(root.val);//list应该写在这个遍历方法的外面
    }
}
