package algorithm.dataStructure.tree;

public class BSTNode {
    int val;
    BSTNode left;
    BSTNode right;

    BSTNode() {}

    BSTNode(int val) { this.val = val; }

    BSTNode(int val, BSTNode left, BSTNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
