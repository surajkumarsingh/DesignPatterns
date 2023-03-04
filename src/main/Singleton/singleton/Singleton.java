package singleton;

/**
 * The Singleton pattern is a design pattern that restricts the instantiation of
 * a class to a single instance and provides a global point of access to that
 * instance. It is a creational pattern that is often used when we want to
 * ensure that there is only one instance of a class in an application and that
 * this instance is easily accessible throughout the entire application.
 * 
 * The Singleton pattern typically involves creating a private constructor for
 * the class and a static method that returns a single instance of the class.
 * The first time this method is called, it creates a new instance of the class,
 * and subsequent calls to the method return the same instance. This ensures
 * that there is only one instance of the class in the application.
 * 
 * @author SurajKumar
 *
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {
		// private constructor to prevent outside instantiation
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// Other methods and variables of the class

}
