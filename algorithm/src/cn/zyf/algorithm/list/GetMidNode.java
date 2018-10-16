package cn.zyf.algorithm.list;

public class GetMidNode {
	// 获得中间节点
	public Node getMidNode(Node head) {
		if (head == null)
			return null;
		Node one = head;
		Node two = head;
		while (two.next != null) {
			two = two.next;
			one = one.next;
			if (two.next != null)
				two = two.next;
		}
		return one;
	}

}
