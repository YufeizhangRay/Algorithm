package cn.zyf.algorithm.tree;

public class PreorderTraversalRec {

	public void preorderTraversalRec(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val + "");
		preorderTraversalRec(root.left);
		preorderTraversalRec(root.right);
	}

}
