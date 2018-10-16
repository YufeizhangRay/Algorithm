package cn.zyf.algorithm.string;

public class LongestSubSequence {

	// 最长公共子序列
	public int longestSubSequence(String str1, String str2) {
		if (str1.length() == 0 || str1.length() == 0)
			return 0;
		if (str1.charAt(0) == str2.charAt(0))
			return 1 + longestSubSequence(str1.substring(1), str2.substring(2));
		else
			return Math.max(longestSubSequence(str1, str2.substring(1)), longestSubSequence(str1.substring(1), str2));
	}

}
