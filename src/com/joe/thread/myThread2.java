package com.joe.thread;
//线程数据共享,但不安全
public class myThread2 extends Thread {
	private int count=5;
	public void run() {
		count --;
		System.out.println(this.currentThread().getName()+" 计算，count="+count);
	}
}
