package br.com.caiosisprog.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaImagens extends JFrame {

	private static final long serialVersionUID = 1L;

	public TelaImagens() {
		super("Tela para visualização de imagem");
		this.configuraTela();
		this.preparandoMenu();

	}

	private void configuraTela() {
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void preparandoMenu() {
		JMenuBar barraMenu = new JMenuBar();
		this.setJMenuBar(barraMenu);

		JMenu menuArquivo = new JMenu("Arquivo");
		barraMenu.add(menuArquivo);

		JMenuItem itemAbrir = new JMenuItem("Abrir");
		itemAbrir.addActionListener(new ListenerTela());
		menuArquivo.add(itemAbrir);

		JMenuItem itemSair = new JMenuItem("Sair");
		itemSair.addActionListener(new ListenerTela());
		menuArquivo.add(itemSair);

	}

	public class ListenerTela implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String acao = e.getActionCommand();

			if ("Abrir".equals(acao)) {
				JOptionPane.showMessageDialog(null, "Abrir evento");

			} else if ("Sair".equals(acao)) {
				fecharTela();
			}

		}

	}

	private void fecharTela() {
		this.setVisible(false);
		System.exit(0);
	}
}
