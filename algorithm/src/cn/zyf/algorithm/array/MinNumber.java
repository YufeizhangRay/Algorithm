package cn.zyf.algorithm.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinNumber {

	// 把数组排成最小的数
	public String minNumber(int[] num) {
		if (num == null || num.length == 0)
			return null;
		StringBuilder sb = new StringBuilder("");
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++)
			al.add(num[i]);
		Collections.sort(al, new Comparator<Integer>() {
			public int compare(Integer s1, Integer s2) {
				String str1 = s1 + "" + s2;
				String str2 = s2 + "" + s1;
				return str1.compareTo(str2);
			}
		});
		for (int s : al) {
			sb.append(s);
		}
		String str = sb.toString();
		return str;
	}

}
