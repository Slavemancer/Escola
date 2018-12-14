package vetores;

import javax.swing.JOptionPane;

public class Exercicio11_1 {

	public static void main(String[] args) {
		//declarar variaveis
		double[] n = new double[5];
		
		//ler os elementos
		for (int i = 0; i < n.length; i++) {
			n[i]=Double.parseDouble(JOptionPane.showInputDialog("nota["+i+"]"));			
		}
		
		//achar média
		
		double soma=0;
		
		for (int i = 0; i < n.length; i++) {
			soma+=n[i];
		}
		System.out.println(soma/n.length);

	}

}
