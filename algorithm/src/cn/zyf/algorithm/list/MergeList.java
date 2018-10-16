package cn.zyf.algorithm.list;

public class MergeList {

	// 合并链表
	public Node mergeList(Node list1, Node list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		Node resultList = null;
		if (list1.val < list2.val) {
			resultList = list1;
			list1 = list1.next;
		} else {
			resultList = list2;
			list2 = list2.next;
		}
		resultList.next = mergeList(list1, list2);
		return resultList;
	}

}
