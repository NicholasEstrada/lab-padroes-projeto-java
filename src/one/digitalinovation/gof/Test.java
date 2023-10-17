package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.*;
import one.digitalinovation.gof.strategy.*;

public class Test {

	public static void main(String[] args) {
		// Testes relacionados ao design patterns Singleton
		
		SingletonLazy lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getIntancia();
		System.out.println(eager);
		eager = SingletonEager.getIntancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIntancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getIntancia();
		System.out.println(lazyHolder);
		
		// Stratategy
		
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Roberto", "89329890");
	}

}
