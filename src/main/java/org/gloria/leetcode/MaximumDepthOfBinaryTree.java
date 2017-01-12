package org.gloria.leetcode;

import org.junit.Test;

/**
 * Create on 2017/1/12 17:53.
 *
 * @author : gloria.
 */
public class MaximumDepthOfBinaryTree {


    public int maxDepth(TreeNode root) {

        return depth(root);
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
    
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    
    @Test
    public void test() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(3);
        System.out.println(maxDepth(node));
    }
}
