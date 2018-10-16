package cn.zyf.algorithm.string;

public class LongestCommonPrefix {

	// 最长公共前缀
	String[] s = { "acvxx", "axc", "aaa" };

	public String longestCommonPrefix(String[] s) {
		if (s == null || s.length == 0)
			return "";
		String pre = s[0];
		int i = 1;
		while (i < s.length) {
			while (s[i].indexOf(pre) != 0)
				pre = pre.substring(0, pre.length() - 1);
			i++;
		}
		return pre;
	}

}
