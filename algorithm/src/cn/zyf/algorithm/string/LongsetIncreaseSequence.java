package cn.zyf.algorithm.string;

public class LongsetIncreaseSequence {

	// 最长递增子序列
	public int longsetIncreaseSequence(int[] num) {
		if (num.length == 0)
			return 0;
		int[] memo = new int[num.length];
		for (int i = 1; i < num.length; i++)
			for (int j = 0; j < i; j++)
				if (num[i] > num[j])
					memo[i] = Math.max(memo[i], memo[j] + 1);
		int max = 0;
		for (int i = 0; i < num.length; i++)
			max = Math.max(max, memo[i]);
		return max;
	}

}
