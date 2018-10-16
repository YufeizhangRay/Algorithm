package cn.zyf.algorithm.tree;

public class PostorderTraveraslRec {

	public void postorderTraveraslRec(TreeNode root){
	    if(root==null)
	      return;
	      postorderTraveraslRec(root.left);
	      postorderTraveraslRec(root.right);
	      System.out.print(root.val+" ");
	  }

}
