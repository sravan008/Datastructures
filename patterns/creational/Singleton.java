package creational;

public class Singleton {

	// private static Singleton instance = new Singleton();

	/*
	 * Declaring a volatile Java variable means: The value of this variable will
	 * never be cached thread-locally: all reads and writes will go straight
	 * to"main memory"; Access to the variable acts as though it is enclosed in a
	 * synchronized block, synchronized on itself.
	 */
	private static volatile Singleton instance = null;

	private Singleton() {
		if (instance != null)
			throw new RuntimeException("Use getInstance method to create a Singleton");
	};

	/*
	 * public static Singleton getInstance() { return instance; }
	 */
	// If threads are trying to create a singleton instance at same time, two avoid
	// the deadlock we are checking instance == null two times
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}

}