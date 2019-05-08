package com.joe.runnable;

public class myRunnable implements Runnable {
	String name;
	public myRunnable(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<100) {
			System.out.println(this.name+"Ïß³Ì");
			i++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
