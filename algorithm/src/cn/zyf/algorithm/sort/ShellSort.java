package cn.zyf.algorithm.sort;

public class ShellSort {

	public void shellSort(int[] num) {
		if (num == null)
			return;
		for (int d = num.length / 2; d > 0; d = d / 2) {
			for (int i = d; i < num.length; i += d) {
				int temp = num[i];
				int j;
				for (j = i - d; j >= 0 && num[j] > temp; j -= d) {
					num[j + d] = num[j];
				}
				num[j + d] = temp;
			}
		}
	}
}
