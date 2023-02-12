package com.edu;

import com.edu.model.Celular;

public class Programa {

	public static void main(String[] args) {
		
		Celular iphone = new Celular();

		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioDeVoz();
		
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}

}
