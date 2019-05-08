package com.joe.stopThread;

public class myThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		try {
			for(int i=0;i<500000;i++) {
				if(this.interrupted()) {
					System.out.println("thread is interrupted!");
					throw new InterruptedException();
				}
				else {
					System.out.println("i="+(i+1));
				}
				
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Ïß³Ì±»ÖÕÖ¹");
		}

	}
}
