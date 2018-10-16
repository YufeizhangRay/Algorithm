package cn.zyf.algorithm.queue.stack;

import java.util.Stack;

public class MinStack {

	// 包含min函数的栈
	Stack<Integer> dataStack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();

	public void push(int n) {
		dataStack.push(n);
		if (minStack.isEmpty() || minStack.peek() > n)
			minStack.push(n);
	}

	public void pop() {
		if (dataStack.peek() == minStack.peek())
			minStack.pop();
		dataStack.pop();

	}

	public int top() {
		return dataStack.peek();
	}

	public int min() {
		return minStack.peek();
	}

}
