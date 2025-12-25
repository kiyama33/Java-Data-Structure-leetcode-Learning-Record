package DataStructure.Tree;

//平衡二叉搜索树
public class AVLTree {
    public int val;
    public int height;
    public AVLTree left;
    public AVLTree right;
    public AVLTree(int val){
        this.val = val;
    }
    public int height(AVLTree node) {
        return node == null ? -1 : node.height;
    }
    /* 更新节点高度 */
    public void updateHeight(AVLTree node) {
        node.height = Math.max(height(node.left), height(node.right)) + 1;
    }
    //平衡因子：左子树高度减去右子树高度 avl树的平衡因子>=-1 <=1
    public int balanceFactor(AVLTree node){
        if (node == null){
            return 0;
        }
        return height(node.left)-height(node.right);
    }
    //右旋：看失衡节点node的子节点child的right还有没有child（即grandchild），有的话 node。left = grandchild
    public AVLTree turnright(AVLTree node) {
        AVLTree child = node.left;
        child.right = node;
        AVLTree grandchild = child.right;
        node.left=grandchild;
        updateHeight(node);
        updateHeight(child);
        return child;
    }
    //左旋
    public AVLTree turnleft(AVLTree node){
        AVLTree child = node.right;
        child.left = node;
        AVLTree grandchild = child.left;
        node.right = grandchild;
        updateHeight(node);
        updateHeight(child);
        return child;
    }
    // 平衡因子>1 子节点平衡因子>=0 右旋
    // 平衡因子>1 子节点平衡因子<0 左旋 右旋
    // 平衡因子<-1 子节点平衡因子<=0 左旋
    // 平衡因子<-1 子节点平衡因子>0 右旋 左旋
    /* 执行旋转操作，使该子树重新恢复平衡 */
    AVLTree rotate(AVLTree node) {
        // 获取节点 node 的平衡因子
        int balanceFactor = balanceFactor(node);
        // 左偏树
        if (balanceFactor > 1) {
            if (balanceFactor(node.left) >= 0) {
                // 右旋
                return turnright(node);
            } else {
                // 先左旋后右旋
                node.left = turnleft(node.left);
                return turnright(node);
            }
        }
        // 右偏树
        if (balanceFactor < -1) {
            if (balanceFactor(node.right) <= 0) {
                // 左旋
                return turnleft(node);
            } else {
                // 先右旋后左旋
                node.right = turnright(node.right);
                return turnleft(node);
            }
        }
        // 平衡树，无须旋转，直接返回
        return node;
    }

}
