package exercicios;

import ferramentas.Ferramentas;

public class Piramides {

	public static void main(String[] args) {
		int largura = Ferramentas.pedir_int("largura");
		int altura = Ferramentas.pedir_int("altura");
		mostrar(diagonal(largura, altura));
		mostrar(superior(largura, altura));
		mostrar(inferior(largura, altura));
		mostrar(meio_superior(largura, altura));
		
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
	
	public static String [][] vazio(int largura, int altura) {
		String[][] valores = new String[altura][largura];
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < largura; j++) {
				valores[i][j]=" ";
			}
		}
		return(valores);
	}
	
	public static String[][] diagonal(int largura, int altura) {
		String[][] valores = vazio(largura,altura);
		for (int i = 0; i < valores.length; i++) {
			valores[i][i]="X";
		}
		return(valores);
	}
	
	public static String[][] superior(int largura,int altura){
		String[][] valores = vazio(largura,altura);
		for (int i = 1; i < valores.length; i++) {
			for (int j = i; j < valores[0].length; j++) {
				valores[i][j] ="X";
			}
		}
		return valores;
	}

	public static String[][] inferior(int largura,int altura){
		String[][] valores = vazio(largura,altura);
		for (int i = 0; i < valores.length; i++) {
			for (int j = i; j < valores[0].length; j++) {
				valores[j][i] ="X";
			}
		}
		return valores;
	}
	
	public static String[][] meio_superior(int largura,int altura){
		String[][] valores = vazio(largura,altura);
		int limite;
		if((largura % 2)!=0) {
			limite = (largura+1)/2;
		} else {
			limite = (largura)/2;
		}
		for (int i = 0; i < limite; i++) {
			for (int j = i; j < valores[0].length - i; j++) {
				valores[i][j] ="X";
			}
		}
		return valores;
	}
	

}
