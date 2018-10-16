package cn.zyf.algorithm.list;

public class GetLastKthNode {
	// 获得最后第K个节点
	public Node getLastKthNode(Node head, int k) {
		if (k == 0 || head == null)
			return null;
		Node first = head;
		Node last = head;
		while (k > 1 && first != null) {
			k--;
			first = first.next;
		}
		if (k > 1 || first == null) {
			return null;
		}
		while (first.next != null) {
			first = first.next;
			last = last.next;
		}
		return last;
	}
}
