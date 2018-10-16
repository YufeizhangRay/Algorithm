package cn.zyf.algorithm.string;

public class LongestSubString {

	// 最长公共子串
	public int longestSubString(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0)
			return 0;
		int len1 = str1.length();
		int len2 = str1.length();
		int[][] arr = new int[len1][len2];
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					if (i >= 1 && j >= 1)
						arr[i][j] = arr[i - 1][j - 1] + 1;
					else
						arr[i][j] = 1;
				} else
					arr[i][j] = 0;
			}
		}
		int max = 0;
		for (int i = 0; i < len1; i++)
			for (int j = 0; j < len2; j++)
				Math.max(arr[i][j], max);
		return max;
	}

}
