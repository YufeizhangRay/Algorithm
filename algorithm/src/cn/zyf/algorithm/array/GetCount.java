package cn.zyf.algorithm.array;

public class GetCount {

	// 数字在排序数组中出现的次数
	int getCount(int[] num, int start, int end, int target) {
		if (start > end)
			return 0;
		int mid = (start + end) / 2;
		int midvalue = num[mid];
		if (target > midvalue)
			return getCount(num, mid + 1, end, target);
		else if (target < midvalue)
			return getCount(num, start, mid - 1, target);
		else
			return 1 + getCount(num, start, mid - 1, target) + getCount(num, mid + 1, end, target);
	}

	public int getNumberOfK(int[] num, int k) {
		if (num == null || num.length == 0)
			return 0;
		return getCount(num, 0, num.length, k);
	}

}
