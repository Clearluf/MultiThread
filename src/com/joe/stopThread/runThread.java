package com.joe.stopThread;

public class runThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			myThread mt=new myThread();
			mt.start();
			Thread.sleep(500);
			mt.interrupt();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
	}

}
