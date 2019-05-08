package com.joe.resumeThread;

public class myThread extends Thread{
	int i=0;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
		@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			i++;
		}
	}
}
