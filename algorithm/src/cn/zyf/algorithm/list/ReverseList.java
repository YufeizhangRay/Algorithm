package cn.zyf.algorithm.list;

public class ReverseList {

	// 链表倒置
	public Node reverseList(Node head) {
		if (head == null || head.next == null)
			return head;
		Node reHead = null;
		Node cur = head;
		while (cur != null) {
			Node reCur = cur;
			cur = cur.next;
			reCur.next = reHead;
			reHead = reCur;
		}
		return reHead;
	}

}
