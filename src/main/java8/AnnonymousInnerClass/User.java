package AnnonymousInnerClass;

public class User {

	public static void main(String[] args) {
		ITask obj = new ITask()

		// Below Anonymous inner class used when we want to use implemented method only
		// once not other classes.
		{
			@Override
			public void task() {
				System.out.println("Annonymous Inner class");
			}

			@Override
			public void task2(String a) {
				

			}
		};

		/*
		 * Below is used with lambda expression but only can be used with functional
		 * interface
		 */

//		ITask obj2 = () -> System.out.println("Annonymous Inner class");
//        
//		obj2.task();
		obj.task();
	}

}
