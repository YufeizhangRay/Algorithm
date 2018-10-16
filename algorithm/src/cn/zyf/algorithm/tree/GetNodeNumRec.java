package cn.zyf.algorithm.tree;

public class GetNodeNumRec {
	// 获得节点数
	public int getNodeNumRec(TreeNode root) {
		if (root == null)
			return 0;
		return getNodeNumRec(root.left) + getNodeNumRec(root.right) + 1;
	}

}
