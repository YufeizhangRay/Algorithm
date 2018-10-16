package cn.zyf.algorithm.array;

public class DuplicationInArray {
	// 数组中重复的数字
	public int duplicationInArray(int[] num, int n) {
		if (num == null || n <= 0)
			return -1;
		for (int i = 0; i < num.length; i++) {
			while (num[i] != i) {
				if (num[i] == num[num[i]]) {
					return num[i];
				} else {
					int temp = num[i];
					num[i] = num[num[i]];
					num[temp] = temp;
				}
			}
		}
		return -1;
	}

}
