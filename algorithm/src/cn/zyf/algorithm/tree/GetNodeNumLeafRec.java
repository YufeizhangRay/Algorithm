package cn.zyf.algorithm.tree;

public class GetNodeNumLeafRec {
	// 获得叶子数
	public int getNodeNumLeafRec(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		return getNodeNumLeafRec(root.left) + getNodeNumLeafRec(root.right);
	}

}
