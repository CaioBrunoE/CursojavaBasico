package br.com.caiosisprog.view;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaInicial extends JFrame {
   
	
	private static final long serialVersionUID = 1L;
	
	private JLabel label1;
	
	public TelaInicial() {
		super("Tela Inicial");
		
		this.configuraTela();
	}
	
	private void configuraTela() {
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 300);
		
		label1 =new JLabel("Sejam brm vindos !!");
		label1.setToolTipText("Este rotulo 1");
		add(label1);
	}
	
}