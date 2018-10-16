package cn.zyf.algorithm.sort;

public class SelectSort {

	public void selectSort(int[] array) {
		if (array == null)
			return;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
