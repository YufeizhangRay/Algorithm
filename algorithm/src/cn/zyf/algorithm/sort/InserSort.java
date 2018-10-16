package cn.zyf.algorithm.sort;

public class InserSort {

	public void insertSort(int[] num) {
		if (num == null)
			return;
		for (int i = 1; i < num.length; i++) {
			int temp = num[i];
			int j; // 记得是j>=0不要忘记等号，否则，前两个将不参与比较
			for (j = i - 1; j >= 0 && num[j] > temp; j--) {
				num[j + 1] = num[j]; // 将前面的较大元素往后移动
			}
			num[j + 1] = temp; // 将num[i]放在指定位置
		}
	}
}
