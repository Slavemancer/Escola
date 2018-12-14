package ferramentas;

import javax.swing.JOptionPane;

public class Ferramentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static double[] pedir_doubles() {
		int quantos = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros pretende inserir ?"));
		double[] valores = new double[quantos];
		for (int i = 0; i < quantos; i++) {
			valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
		}
		return valores;
	}
	
	public static int[] pedir_ints() {
		int quantos = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros pretende inserir ?"));
		int[] valores = new int[quantos];
		for (int i = 0; i < quantos; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		}
		return valores;
	}
	
	public static int pedir_int(String nome) {
		return Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para a "+nome+" ?"));
	}
	
	public static void mostrar(String[][] valores) {
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[0].length; j++) {
				System.out.print(valores[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void mostrar(int[][] valores) {
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[0].length; j++) {
				System.out.print(valores[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void mostrar(Double[][] valores) {
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[0].length; j++) {
				System.out.print(valores[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
