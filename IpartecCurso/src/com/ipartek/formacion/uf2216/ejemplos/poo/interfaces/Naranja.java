package com.ipartek.formacion.uf2216.ejemplos.poo.interfaces;

public class Naranja extends Fruto implements Rodable, Comestible {

	@Override
	public void comer() {
		System.out.println("Ñam, que rica la naranja");
	}

	@Override
	public void rodar() {
		System.out.println("Rodando voy, rodando vengo (naranja)");		
	}

}
