package com.joe.thread;
//线程数据不共享
public class myThread1 extends Thread {
	int count;
	String name;
	public myThread1(int count,String name) {
		this.count=count;
		this.name=name;
	}
	public void run() {
		while(count>=0) {
			System.out.println(name+": "+count);
			count--;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
