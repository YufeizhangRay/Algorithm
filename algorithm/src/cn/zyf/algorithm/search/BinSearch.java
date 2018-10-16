package cn.zyf.algorithm.search;

public class BinSearch {

	public int binSearch(int[] array, int target) {
		if (array == null)
			return -1;
		int minIndex = 0;
		int maxIndex = array.length - 1;
		int midIndex = 0;
		while (minIndex <= maxIndex) {
			midIndex = (minIndex + maxIndex) / 2;
			if (array[midIndex] < target) {
				minIndex = midIndex + 1;
			} else if (array[midIndex] > target) {
				maxIndex = midIndex - 1;
			} else
				return midIndex;
		}
		return -1;
	}
}
