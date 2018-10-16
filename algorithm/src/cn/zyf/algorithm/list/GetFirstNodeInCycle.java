package cn.zyf.algorithm.list;

public class GetFirstNodeInCycle {

	// 求进入环中的第一个节点
	public Node getFirstNodeInCycle(Node head) {
		if (head == null || head.next == null)
			return null;
		Node fast = head;
		Node slow = head;
		while (fast != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				slow = head;
				while (fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return fast;
			}
		}
		return null;
	}

}
