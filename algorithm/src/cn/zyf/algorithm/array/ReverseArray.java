package cn.zyf.algorithm.array;

public class ReverseArray {
	// 数组倒置
	public void reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
	}

}
