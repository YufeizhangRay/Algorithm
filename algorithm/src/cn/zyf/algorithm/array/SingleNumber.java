package cn.zyf.algorithm.array;

public class SingleNumber {
	// 数组中只出现一次的数(其他三次)
	public int singleNumber(int[] num) {
		int[] bitSum = new int[32];
		for (int i = 0; i < num.length; i++) {
			int bitMask = 1;
			for (int j = 31; j >= 0; j--) {
				if ((bitMask & num[i]) == 1)
					bitSum[j] += 1;
				bitMask <<= 1;
			}
		}
		int result = 0;
		for (int i = 0; i < 32; i++) {
			result += bitSum[i] % 3;
			result <<= 1;
		}
		return result;
	}

}
