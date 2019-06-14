package com.ipartek.formacion.uf2216.ejemplos.poo.interfaces;

public class Balon extends ObjetoDeporte implements Rodable {

	@Override
	public void rodar() {
		System.out.println("Balón rodando");
	}

}
