package cn.zyf.algorithm.list;

public class GetFirstCommonNode {

	// 获得第一个公共节点
	public Node getFirstCommonNode(Node list1, Node list2) {
		if (list1 == null || list2 == null)
			return null;
		int len1 = 0;
		Node tail1 = list1;
		while (tail1.next != null) {
			tail1 = tail1.next;
			len1++;
		}
		int len2 = 0;
		Node tail2 = list2;
		while (tail2.next != null) {
			tail2 = tail2.next;
			len2++;
		}
		if (tail1 != tail2)
			return null;
		int abs = 0;
		Node head1 = list1;
		Node head2 = list2;
		if (len1 > len2) {
			abs = len1 - len2;
			while (abs != 0) {
				head1 = head1.next;
				abs--;
			}
		} else {
			abs = len2 - len1;
			while (abs != 0) {
				head2 = head2.next;
				abs--;
			}
		}
		while (head1 != head2) {
			head1 = head1.next;
			head2 = head2.next;
		}
		return head1;
	}

}
