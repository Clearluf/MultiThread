package com.joe.thread;
//�߳����ݹ���,������ȫ
public class myThread2 extends Thread {
	private int count=5;
	public void run() {
		count --;
		System.out.println(this.currentThread().getName()+" ���㣬count="+count);
	}
}
