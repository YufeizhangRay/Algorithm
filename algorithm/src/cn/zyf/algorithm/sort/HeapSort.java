package cn.zyf.algorithm.sort;

public class HeapSort {

	// 调整堆
	void downHeap(int[] array, int i, int size) {
		int lchild = i * 2;
		int rchild = i * 2 + 1;
		int max = i;
		if (lchild <= size - 1 && array[lchild] > array[max]) {
			max = lchild;
		}
		if (rchild <= size - 1 && array[rchild] > array[max]) {
			max = rchild;
		}
		if (max != i) {
			int temp = array[max];
			array[max] = array[i];
			array[i] = temp;
			downHeap(array, max, size);
		}
	}

	// 建立堆
	void bulidHeap(int[] array, int size) {
		for (int i = (size - 1) / 2; i >= 0; i--) {
			downHeap(array, i, size);
		}
	}

	// 排序堆
	public void heapSort(int[] array, int size) {
		if (array == null)
			return;
		bulidHeap(array, size);
		for (int i = size - 1; i >= 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = array[0];
			downHeap(array, 0, i - 1);
		}
	}

}
