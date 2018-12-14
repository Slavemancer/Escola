package desafios;

import javax.swing.JOptionPane;

public class triangulo_pascal {

	public static void main(String[] args) {
		int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas pretende ?"));
		int largura=2*comprimento-1;
		//int temp=1;
		//int meio;
		int[][] triangulo= new int[comprimento][largura];
		for (int i = 0; i < largura; i++) {
			triangulo[0][i]=1;
		}
		for (int i = 1; i <largura; i++) {
			for (int j = 1; j < comprimento; j++) {
				triangulo[j][i]=j/i;				
			}
		}//*/
		//int p = 0;
		//meio=p+p;
		for (int i = 0; i < triangulo.length; i++) {
			for (int j = 0; j < triangulo.length; j++) {
				System.out.print(triangulo[j][i]);
			}
			System.out.println();
		}
	}

}
