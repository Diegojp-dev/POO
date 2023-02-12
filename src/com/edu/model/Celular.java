package com.edu.model;

import com.edu.funcionalidades.AparelhoTelefonico;
import com.edu.funcionalidades.NavegadorNaInternet;
import com.edu.funcionalidades.ReprodutorMusical;

public class Celular implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("tocando");
	}

	@Override
	public void pausar() {
		System.out.println("pausado");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("musica selecionada");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("pagina exibida");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("adicionada nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("pagina atualizada");
		
	}

	@Override
	public void ligar() {
		System.out.println("ligando");
		
	}

	@Override
	public void atender() {
		System.out.println("em uma chamada");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("correio de voz iniciado");
		
	}

	
	
}
