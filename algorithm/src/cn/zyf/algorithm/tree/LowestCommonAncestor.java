package cn.zyf.algorithm.tree;

public class LowestCommonAncestor {
	// 树中两个节点的最低公共祖先节点
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q)
			return root;
		if (root.val > p.val && root.val > q.val)
			return lowestCommonAncestor(root.left, p, q);
		else if (root.val < p.val && root.val < q.val)
			return lowestCommonAncestor(root.right, p, q);
		else
			return root;
	}
	
	//不存在parent指针
	  public TreeNode lowestCommonAncestor1(TreeNode root,TreeNode p,TreeNode q){
	    if(root==null||root==p||root==q)
	      return root;
	    TreeNode left = lowestCommonAncestor1(root.left,p,q);
	    TreeNode right = lowestCommonAncestor1(root.right,p,q);
	    if(left==null)
	      return right;
	    if(right==null)
	      return left;
	    return root;
	  }


}
