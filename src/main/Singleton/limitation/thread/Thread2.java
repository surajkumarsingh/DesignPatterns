package limitation.thread;

import singleton.Singleton;

public class Thread2 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread 2: "+Singleton.getInstance());
		System.out.println("Thread 2: "+Singleton.getInstance());
	}
	
}
