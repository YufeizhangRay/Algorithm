package cn.zyf.algorithm.tree;

public class GetDepthRec {
	// 获得深度
	public int getDepthRec(TreeNode root) {
		if (root == null)
			return 0;
		int left = getDepthRec(root.left);
		int right = getDepthRec(root.right);
		return (left > right ? left : right) + 1;
	}

}
