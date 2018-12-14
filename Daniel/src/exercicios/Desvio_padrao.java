package exercicios;

import javax.swing.JOptionPane;

public class Desvio_padrao {

	public static void main(String[] args) {		
		System.out.println("O desvio padrão é " + desvio(pedir_valores()));
		
	}
	
	public static double[] pedir_valores() {
		int quantos = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros pretende inserir ?"));
		double[] valores = new double[quantos];
		for (int i = 0; i < quantos; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		}
		return valores;
	}
	
	public static double media(double[] numeros) {
		double soma=0;		
		for (int i = 0; i < numeros.length; i++) {
			soma+=numeros[i];
		}
		return soma / numeros.length;
	}

	public static double somatorio(double[] numeros) {
		double somatorio = 0;		
		for (int i = 0; i < numeros.length ; i++) {
			somatorio += Math.pow(numeros[i] - media(numeros),2);
		}
		return somatorio;
	}
	
	public static double desvio(double[] numeros) {
		return Math.sqrt(somatorio(numeros)/(numeros.length-1));
	}
}
