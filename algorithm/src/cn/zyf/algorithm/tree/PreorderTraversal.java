package cn.zyf.algorithm.tree;

import java.util.Stack;

public class PreorderTraversal {

	// DFS
	public void preorderTraversal(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode top = null;
		s.push(root);
		while (!s.isEmpty()) {
			top = s.pop();
			System.out.print(top.val + " ");
			if (top.right != null)
				s.push(top.right);
			if (top.left != null)
				s.push(top.left);
		}
	}

}
