package cn.zyf.algorithm.queue.stack;

import java.util.Stack;

public class TwoStackMakeQueue {

	// 用两个栈实现队列

	Stack<Integer> Stackin = new Stack<Integer>();
	Stack<Integer> Stackout = new Stack<Integer>();

	public void appendTail(int n) {
		Stackin.push(n);
	}

	public int deleteHead() {
		if (Stackin.isEmpty() && Stackout.isEmpty())
			throw new RuntimeException("队列为空");
		else if (Stackout.isEmpty()) {
			while (!Stackin.isEmpty())
				Stackout.push(Stackin.pop());
		}
		return Stackout.pop();
	}

}
