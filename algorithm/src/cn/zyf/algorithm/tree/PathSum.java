package cn.zyf.algorithm.tree;

import java.util.ArrayList;

public class PathSum {
	// 找到所有满足条件的路径并且返回
	ArrayList<ArrayList<Integer>> aal = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> al = new ArrayList<Integer>();

	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		if (root == null)
			return aal;
		al.add(root.val);
		if (root.left == null && root.right == null && sum - root.val == 0)
			aal.add(new ArrayList<Integer>(al));
		pathSum(root.left, sum - root.val);
		pathSum(root.right, sum - root.val);
		al.remove(al.size() - 1);
		return aal;
	}

	// 路径的定义不必从根节点开始，也不必终止与叶子节点，只需要保证从父节点指向子节点即可。
	int path(TreeNode root, int sum) {
		if (root == null)
			return 0;
		return (root.val == 0 ? 1 : 0 + path(root.left, sum - root.val) + path(root.right, sum - root.val));
	}

	public int pathSum2(TreeNode root, int sum) {
		if (root == null)
			return 0;
		return path(root, sum) + pathSum2(root.left, sum) + pathSum2(root.right, sum);
	}
}
