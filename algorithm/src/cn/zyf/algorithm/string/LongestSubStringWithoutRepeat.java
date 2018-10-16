package cn.zyf.algorithm.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeat {

	// 最长不含重复字符的子字符串
	public int longestSubStringWithoutRepeat(String str) {
		if (str == null || str.length() == 0)
			return 0;
		int max = 0;
		int count = 0;
		char[] carr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(carr[i])) {
				map.put(carr[i], i);
				count++;
			} else {
				Integer index = map.get(carr[i]);
				if (i - index > count) {
					map.put(carr[i], i);
					count++;
				} else {
					map.put(carr[i], i);
					if (count > max)
						max = count;
					count = i - index;
				}
			}
		}
		return max > count ? max : count;
	}
}
