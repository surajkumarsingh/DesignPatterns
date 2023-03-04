package limitation.thread;

import singleton.Singleton;

public class Thread1 extends Thread {

	
	@Override
	public void run() {
		System.out.println("Thread 1: "+Singleton.getInstance());
		}
	
}
