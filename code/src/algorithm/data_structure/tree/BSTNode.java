package algorithm.data_structure.tree;

import java.util.ArrayList;
import java.util.List;

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

    private boolean checkValid(BSTNode node, int lowerBound, int upperBound) {
        if(node == null) {
            return true;
        }

        if((node.val <= lowerBound) || (node.val >= upperBound)) {
            return false;
        }

        return checkValid(node.left, lowerBound, node.val) && checkValid(node.right, node.val, upperBound);
    }

    public boolean verifyBST() {
        return checkValid(this, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private void preOrderDFS(BSTNode root, List<Integer> result) {
        if(root == null) {
            return ;
        }

        result.add(root.val);
        preOrderDFS(root.left, result);
        preOrderDFS(root.right, result);
    }

    public List<Integer> preOrderTraverse(BSTNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderDFS(root, result);

        return result;
    }

    private void inOrderDFS(BSTNode root, List<Integer> result) {
        if(root == null) {
            return ;
        }

        inOrderDFS(root.left, result);
        result.add(root.val);
        inOrderDFS(root.right, result);
    }

    public List<Integer> inOrderTraverse(BSTNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderDFS(root, result);

        return result;
    }

    private void postOrderDFS(BSTNode root, List<Integer> result) {
        if(root == null) {
            return ;
        }

        inOrderDFS(root.left, result);
        inOrderDFS(root.right, result);
        result.add(root.val);
    }

    public List<Integer> postOrderTraverse(BSTNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderDFS(root, result);

        return result;
    }


    public static void main(String[] args) {
        BSTNode root = new BSTNode(2);
        BSTNode left = new BSTNode(1);
        BSTNode right = new BSTNode(3);
        root.left = left;
        root.right = right;

        System.out.println(root.verifyBST());
    }
}
