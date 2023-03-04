package singleton;

/**
 * In this example, we have added the volatile keyword to the instance variable,
 * which ensures that the variable is always read from and written to main
 * memory, rather than from a thread's local cache. This prevents race
 * conditions that can occur when multiple threads access the variable
 * simultaneously.
 * 
 * We have also added a double-checked locking mechanism to the getInstance
 * method to ensure that only one instance of the class is created, even in a
 * multi-threaded environment. The first if statement checks if an instance of
 * the class already exists, and if it does not, the method enters a
 * synchronized block. The second if statement checks if an instance of the
 * class still does not exist, and if it does not, it creates a new instance and
 * assigns it to the instance variable.
 * 
 * By using the volatile keyword and the double-checked locking mechanism, we
 * can ensure that only one instance of the class is created and that the class
 * is thread-safe. The Singleton pattern has several benefits and can be useful
 * in various use cases. Some of the benefits and use cases of the Singleton
 * pattern include:
 * 
 * Ensures only one instance of a class: The Singleton pattern ensures that only
 * one instance of a class is created, which can be useful in situations where
 * creating multiple instances of the same class would cause issues, such as
 * consuming too many resources.
 * 
 * Global point of access: Since the Singleton pattern creates a single instance
 * of a class, it provides a global point of access to that instance, making it
 * easy to access the class from anywhere in the code.
 * 
 * Reduces memory usage: By ensuring that only one instance of a class is
 * created, the Singleton pattern can reduce memory usage and improve
 * performance, especially in situations where the class is resource-intensive.
 * 
 * Improves flexibility: The Singleton pattern allows you to change the behavior
 * of a class by modifying the singleton instance, rather than modifying every
 * instance of the class. This can make the code more flexible and easier to
 * maintain.
 * 
 * Useful for logging, database connections, and caches: The Singleton pattern
 * is commonly used for creating logging instances, managing database
 * connections, and implementing caches.
 * 
 * @author SurajKumar
 *
 */
public class ThreadSafeSingleton {
	private static volatile ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
		// private constructor to prevent outside instantiation
	}

	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

	// Other methods and variables of the class
}
