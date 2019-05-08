package com.joe.thread;

public class testThread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread3 mt=new myThread3();
		Thread a=new Thread(mt, "A");
		Thread b=new Thread(mt, "B");
		Thread c=new Thread(mt, "C");
		Thread d=new Thread(mt, "D");
		Thread e=new Thread(mt, "E");

		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}

}
