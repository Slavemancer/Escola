package testar;

import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
		int limite = 8;
		char[] letras = new char[8];
		for (int i = 0; i < letras.length; i++) {
			letras[i]= JOptionPane.showInputDialog("Introduza uma letra").charAt(0);
		}
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		String palavra = "hangman";
		int erradas=0;
		int pontos=0;
		char letra;
		while(erradas<=limite && pontos<palavra.length()) {
			
		}
		

	}

}
