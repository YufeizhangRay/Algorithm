package cn.zyf.algorithm.array;

public class ReOrderArray {

	//奇数位于偶数前面
	public void reOrderArray(int[] num) {
		if (num == null || num.length < 2)
			return;
		int left = 0;
		int right = num.length - 1;
		while (left < right) {
			while ((num[left] & 1) == 1)
				left++;
			while ((num[right] & 1) == 0)
				right--;
			if (left < right) {
				int temp = num[left];
				num[left] = num[right];
				num[right] = temp;
			}
		}
	}

}
