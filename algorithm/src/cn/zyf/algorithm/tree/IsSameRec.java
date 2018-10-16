package cn.zyf.algorithm.tree;

public class IsSameRec {
	// 树是否相同
	public Boolean isSameRec(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		if (root1.val == root2.val) {
			return isSameRec(root1.left, root2.left) && isSameRec(root1.right, root2.right);
		} else
			return false;
	}

}
