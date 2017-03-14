package CreationalDesignPattern.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonDemo implements Serializable {

	private static final long serialVersionUID = 8765589437300322881L;

	// static variable so that it can hold one single instance of our class.
	private volatile static SingletonDemo sc = null; // Lazy Initialization

	// A private Constructor prevents any other class from instantiating.
	private SingletonDemo() {
		// Avoid Reflection to destroy Singleton Pattern
		if (sc != null) {
			throw new IllegalStateException("Already created.");
		}
	}

	private Object readResolve() throws ObjectStreamException {
		return sc;
	}

	// Avoid cloning of the object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}

	private static Class getClass(String classname) throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if (classLoader == null)
			classLoader = SingletonDemo.class.getClassLoader();
		return (classLoader.loadClass(classname));
	}

	// Double check of Singleton object
	public static SingletonDemo getInstance() {
		if (sc == null) { // first check
			synchronized (SingletonDemo.class) {
				if (sc == null) { // double check
					sc = new SingletonDemo(); // creating instance of
												// ResourceService for only one
												// time
				}
			}
		}
		return sc;
	}

	public static void main(String[] args) {
		SingletonDemo singletonDemo= new SingletonDemo();
		System.out.println("First object : " + SingletonDemo.getInstance().hashCode());
		System.out.println("Second object : " + SingletonDemo.getInstance().hashCode());
		System.out.println("Third object : " + SingletonDemo.getInstance().hashCode());
	}
}

// public enum Singleton{
// INSTANCE;
//
// public void show(){
// System.out.println("Singleton using Enum in Java");
// }
// }
//
// You can access this Singleton as Singleton.INSTANCE and call any method like
// below
// Singleton.INSTANCE.show();
