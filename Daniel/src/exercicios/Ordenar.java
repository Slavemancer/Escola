package exercicios;

public class Ordenar {

	public static void main(String[] args) {
		int[] vet = {9,7,2,3,5,6};
		int[][] tabel = {{3,4,5,6},{2,5,1,4},{4,2,3,1},{1,2,3,4}};
		vetor(vet);
		tabela(tabel);
	}
	
	public static void mostrar(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		System.out.println();
	}
	public static void mostrar(int[][] tabela) {
		for (int i = 0; i < tabela.length; i++) {
			for (int j = 0; j < tabela.length; j++) {
				System.out.print(tabela[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static int[] vetor(int[] vetor) {
		int aux;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j]=aux;
					
				}
			}
		}
		return vetor;
	}
	
	public static void tabela(int[][] tabela) {
		int[] aux;
		for (int i = 0; i < tabela.length; i++) {
			for (int j = i; j < tabela.length; j++) {
				if (tabela[i][0] > tabela[j][0]) {
					aux = tabela[j];
					tabela[j] = tabela[i];
					tabela[i]=aux;
					
				}
			}
		}
		mostrar(tabela);
	}
	

}
