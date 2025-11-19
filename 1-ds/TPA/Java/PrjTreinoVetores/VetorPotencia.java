package prjTreinoVetores;

public class VetorPotencia {

	public static void main(String[] args) {
		
		final int TAM = 11;
		int i, n, a[], resultado;
		a = new int [TAM];

		for (i=0; i < TAM; i++) {
			resultado = 1;
			for (n=0; n < i; n++) {
			    resultado = resultado * 2;
			}
			a[i] = resultado;
		}
		
		System.out.print("\nA = [ ");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");	
	}

}
