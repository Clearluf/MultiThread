package com.joe.thread;
//���ݹ�������
public class myThread3 extends Thread{
	private int count=5;
	synchronized public void run() {
		count --;
		System.out.println("�߳�"+this.currentThread().getName()+" ���㣬count="+count);
	}
}

