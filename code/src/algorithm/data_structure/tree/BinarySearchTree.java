package algorithm.data_structure.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private BSTNode root;

    /**
     * The function checks whether a node in BST is valid or not.
     * 
     * 
     * @param node the node to check
     * @param lowerBound the lower bound of the current node
     * @param upperBound the upper bound of the current node
     * @return boolean indicates whether the node is valid
     */
    private boolean checkValid(BSTNode node, int lowerBound, int upperBound) {
        if(node == null) {
            return true;
        }

        if((node.val <= lowerBound) || (node.val >= upperBound)) {
            return false;
        }

        return checkValid(node.left, lowerBound, node.val) && checkValid(node.right, node.val, upperBound);
    }

    /**
     * The function checks whether the BST is valid.
     * 
     * @return boolean indicates whether the tree is valid.
     */
    public boolean verifyBST() {
        return checkValid(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private BSTNode getMinOfNode(BSTNode node) {
        if(node == null) {
            return null;
        }

        if(node.left != null) {
            return getMinOfNode(node.left);
        } else {
            return node;
        }
    }

    public BSTNode getMinNode() {
        return getMinOfNode(this.root);
    }

    private BSTNode getMaxOfNode(BSTNode node) {
        if(node == null) {
            return null;
        }

        if(node.right != null) {
            return getMaxOfNode(node.right);
        } else {
            return node;
        }
    }

    public BSTNode getMaxNode() {
        return getMaxOfNode(this.root);
    }

    /**
     * The function checks whether the current node is the target. If it is, it returns the current node. 
     * Otherwise, it keeps searching in the possible child.
     * 
     * 
     * @param node current node to check
     * @param val the target node's value
     * @return the target node
     */
    public BSTNode searchNode(BSTNode node, int val) {
        if(node == null) {
            return null;
        }

        if(val < node.val) {
            return searchNode(node.left, val);
        } else if(val > node.val) {
            return searchNode(node.right, val);
        } else {
            return node;
        }
    }

    /**
     * The function searches the whole BST for the target node.
     * 
     * @param val the target node's value
     * @return the target node
     */
    public BSTNode search(int val) {
        return searchNode(this.root, val);
    }

    /**
     * The following are tree traversal functions, including in order, preorder, and postorder.
     * All functions are implemented via recursion. 
     */

    /**
     * The function adds the value of the node to the result list in pre-order sequence.
     * 
     * @param node current node to traverse
     * @param result list that stores the value of traversed nodes
     */
    private void preOrderDFS(BSTNode node, List<Integer> result) {
        if(node == null) {
            return ;
        }

        result.add(node.val);
        preOrderDFS(node.left, result);
        preOrderDFS(node.right, result);
    }

    public List<Integer> preOrderTraverse(BSTNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderDFS(root, result);

        return result;
    }

    /**
     * The function adds the value of the node to the result list in in-order sequence.
     * 
     * @param node current node to traverse
     * @param result list that stores the value of traversed nodes
     */
    private void inOrderDFS(BSTNode node, List<Integer> result) {
        if(node == null) {
            return ;
        }

        inOrderDFS(node.left, result);
        result.add(node.val);
        inOrderDFS(node.right, result);
    }

    public List<Integer> inOrderTraverse(BSTNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderDFS(root, result);

        return result;
    }

    /**
     * The function adds the value of the node to the result list in post-order sequence.
     * 
     * @param node current node to traverse
     * @param result list that stores the value of traversed nodes
     */
    private void postOrderDFS(BSTNode node, List<Integer> result) {
        if(node == null) {
            return ;
        }

        inOrderDFS(node.left, result);
        inOrderDFS(node.right, result);
        result.add(node.val);
    }

    public List<Integer> postOrderTraverse(BSTNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderDFS(root, result);

        return result;
    }
}
