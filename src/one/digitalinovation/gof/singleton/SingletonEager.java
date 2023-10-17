package one.digitalinovation.gof.singleton;

// Singleton no modo apressado

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getIntancia() {
		return instancia;
	}
}
