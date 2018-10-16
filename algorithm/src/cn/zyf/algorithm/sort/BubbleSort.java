package cn.zyf.algorithm.sort;

public class BubbleSort {

	public void bubbleSort(int[] array) {
		if (array == null)
			return;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j + 1] < array[j]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}
