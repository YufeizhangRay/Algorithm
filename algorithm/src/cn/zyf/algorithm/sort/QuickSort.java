package cn.zyf.algorithm.sort;

public class QuickSort {

	public void quickSort(int[] array, int low, int high) {
		if (array == null)
			return;
		int i = low;
		int j = high;
		int key = array[low];
		if (low < high) {
			while (i < j) {
				while (i < j && key <= array[j]) {
					j--;
				}
				array[i] = array[j];
				while (i < j && key >= array[i]) {
					i++;
				}
				array[j] = array[i];
				array[i] = key;
			}
			quickSort(array, low, i - 1);
			quickSort(array, i + 1, high);
		}
	}

}
