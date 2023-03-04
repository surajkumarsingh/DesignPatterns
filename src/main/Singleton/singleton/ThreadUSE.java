package singleton;

import limitation.thread.Thread1;
import limitation.thread.Thread2;

public class ThreadUSE {

	
	
	public static void main(String[] args) {
		
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();
		
	}
}
