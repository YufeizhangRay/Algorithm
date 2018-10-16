package cn.zyf.algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;

public class GetNodeNumKthLevel {
	// 获得第K层节点数
	public int getNodeNumKthLevel(TreeNode root, int k) {
		if (root == null)
			return 0;
		if (k == 1)
			return 1;
		int levelcount = 1;
		int count = 0;
		TreeNode cur = null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			count++;
			cur = q.poll();
			if (cur.left != null)
				q.add(cur.left);
			if (cur.right != null)
				q.add(cur.right);
			if (count == levelcount) {
				k--;
				if (k == 0)
					return q.size();
				count = 0;
				levelcount = q.size();
			}
		}
		return -1;
	}

}
