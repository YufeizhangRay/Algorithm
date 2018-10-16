package cn.zyf.algorithm.list;

public class ReverseKgroup {

	// 不足k也反转
	public Node reverseKgroup(Node head, int k) {
		if (head == null || head.next == null)
			return head;
		Node cur = head;
		Node reHead = null;
		int count = 0;
		while (count < k && cur != null) {
			Node reCur = cur;
			cur = cur.next;
			reCur.next = reHead;
			reHead = reCur;
			count++;
		}
		if (cur != null)
			head.next = reverseKgroup(cur, k);
		return reHead;
	}

	// 不足k不转
	int getSize(Node cur) {
		int count = 0;
		Node head = cur;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	// 链表分组倒置
	public Node reverseKgroup1(Node head,int k){
	    if(head==null||head.next==null)
	     return head;
	    Node cur = head;
	    Node reHead = null;
	    if(getSize(cur)>=k){
	      int count = 0;
	      while(count<k&&cur!=null){
	        Node reCur = cur;
	        cur = cur.next;
	        reCur.next = reHead;
	        reHead = reCur;
	        count++;
	      }
	      if(cur!=null)
	        head.next = reverseKgroup1(cur,k);
	      return reHead;
	    }
	    return cur;
	  }

}
