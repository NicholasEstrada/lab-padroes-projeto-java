package one.digitalinovation.gof.singleton;

// Singleton Lazy Holder

public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getIntancia() {
		return InstanceHolder.instancia;
	}
}
