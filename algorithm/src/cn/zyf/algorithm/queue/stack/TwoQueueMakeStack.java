package cn.zyf.algorithm.queue.stack;

import java.util.LinkedList;
import java.util.Queue;

public class TwoQueueMakeStack {

	//用两个队列实现一个栈

	  Queue<Integer> q1 = new LinkedList<Integer>();
	  Queue<Integer> q2 = new LinkedList<Integer>();

	  public void push(int n){
	    q1.add(n);
	  }

	  public int pop(){
	    if(q1.isEmpty()&&q2.isEmpty())
	      throw new RuntimeException("栈空");
	    if(!q1.isEmpty()){
	      while(q1.size()>1)
	        q2.add(q1.poll());
	      return q1.poll();
	    }
	    if(!q2.isEmpty()){
	      while(q2.size()>1)
	        q1.add(q2.poll());
	      return q2.poll();
	    }
		return 0;
	  }

	  public int peek(){
	    if(q1.isEmpty()&&q2.isEmpty())
	      throw new RuntimeException("栈空");
	    if(!q1.isEmpty()){
	      while(q1.size()>1)
	        q2.add(q1.poll());
	      return q1.peek();
	    }
	    if(!q2.isEmpty()){
	      while(q2.size()>1)
	        q1.add(q2.poll());
	      return q2.peek();
	    }
		return 0;
	  }

}
