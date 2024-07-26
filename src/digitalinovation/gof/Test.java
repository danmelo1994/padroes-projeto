package digitalinovation.gof;

import digitalinovation.gof.facade.Facade;
import digitalinovation.gof.singleton.SingletonEager;
import digitalinovation.gof.singleton.SingletonLazy;
import digitalinovation.gof.singleton.SingletonLazyHolder;
import digitalinovation.gof.strategy.Comportamento;
import digitalinovation.gof.strategy.ComportamentoAgressivo;
import digitalinovation.gof.strategy.ComportamentoDefensivo;
import digitalinovation.gof.strategy.ComportamentoNormal;
import digitalinovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		Facade facade = new Facade();
		facade.migrarCliente("Danilo", "35280999");
	}
}
