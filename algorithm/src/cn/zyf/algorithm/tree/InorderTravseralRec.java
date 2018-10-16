package cn.zyf.algorithm.tree;

public class InorderTravseralRec {

	public void inorderTravseralRec(TreeNode root) {
		if (root == null)
			return;
		inorderTravseralRec(root.left);
		System.out.print(root.val + " ");
		inorderTravseralRec(root.right);
	}

}
