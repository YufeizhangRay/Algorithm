package cn.zyf.algorithm.string;

public class StringToInt {

	// 字符串转换成整数
	public Integer stringToInt(String str) {
		if (str == null)
			return null;
		if (str.length() == 0)
			return 0;
		long res = 0;
		int count = 0;
		int num = 0;
		int flag = 1;
		char[] carr = str.toCharArray();
		for (int i = 0; i < carr.length; i++) {
			char c = carr[i];
			if (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				if (flag == 1 && res > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
				else if (flag == -1 && -res < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
				num++;
			} else if (c == ' ' && num == 0 && count == 0)
				continue;
			else if (c == '+' && count == 0)
				count = 1;
			else if (c == '-' && count == 0) {
				count = 1;
				flag = -1;
			} else
				return (int) (res * flag);
		}
		return (int) (res * flag);
	}

}
