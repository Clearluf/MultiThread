package com.joe.thread;
//数据共享，上锁
public class myThread3 extends Thread{
	private int count=5;
	synchronized public void run() {
		count --;
		System.out.println("线程"+this.currentThread().getName()+" 计算，count="+count);
	}
}

