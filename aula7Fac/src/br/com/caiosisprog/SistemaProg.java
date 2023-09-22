package br.com.caiosisprog;

import br.com.caiosisprog.view.TelaImagens;
import br.com.caiosisprog.view.TelaInicial;

public class SistemaProg {

	public static void main(String[] args) {
		
		TelaInicial telaInicial =new TelaInicial();
		telaInicial.setVisible(true);
		
		TelaImagens telaImagens = new TelaImagens();
		telaImagens.setVisible(true);
	}

}
