package com.joe.thread;

public class testThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread1 mt1=new myThread1(100, "a");
		myThread1 mt2=new myThread1(100, "b");
		myThread1 mt3=new myThread1(100, "c");
		mt1.start();
		mt2.start();
		mt3.start();
		
	}

}
