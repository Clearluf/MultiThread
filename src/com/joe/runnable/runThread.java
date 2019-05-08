package com.joe.runnable;

public class runThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myRunnable mr=new myRunnable("aa");
		Thread t=new Thread(mr);		
		myRunnable mr2=new myRunnable("bb");
		Thread t2=new Thread(mr2);		
		myRunnable mr3=new myRunnable("cc");
		Thread t3=new Thread(mr3);
		t.start();
		t2.start();
		t3.start();
		
	}

}
