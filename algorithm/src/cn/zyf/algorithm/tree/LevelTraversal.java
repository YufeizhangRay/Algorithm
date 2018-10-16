package cn.zyf.algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {

	// BFS
	public void levelTraversal(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode cur = null;
		int count = 0;
		int levelcount = 1;
		q.add(root);
		while (!q.isEmpty()) {
			count++;
			cur = q.poll();
			System.out.print(cur.val + " ");
			if (cur.left != null)
				q.add(cur.left);
			if (cur.right != null)
				q.add(cur.right);
			if (count == levelcount) {
				count = 0;
				levelcount = q.size();
				System.out.println("");
			}
		}
	}

}
