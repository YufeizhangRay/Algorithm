package cn.zyf.algorithm.array;

import java.util.HashMap;

public class MajorityElementHash {
	// 数组中数量过半的某个元素(HashMap)
	public Integer majorityElementHash(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		if (nums.length == 1)
			return nums[0];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				Integer value = map.get(nums[i]);
				if (value + 1 > nums.length / 2)
					return nums[i];
				map.put(nums[i], value + 1);
			}
		}
		return null;
	}

	// 数组中数量过半的某个元素
	public Integer majorityElement(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		if (nums.length == 1)
			return nums[0];
		int elem = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				elem = nums[i];
				count++;
			} else {
				if (elem == nums[i]) {
					count++;
				} else {
					count--;
				}
			}
		}
		return elem;
	}

}
