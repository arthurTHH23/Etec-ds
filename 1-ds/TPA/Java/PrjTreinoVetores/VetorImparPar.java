package prjTreinoVetores;
import java.util.Scanner;

public class VetorImparPar {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		final int TAM=19;
		int a[], b[], par=0, impar=TAM-1, i;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o valor "+(i+1)+" do vetor A");
			a[i] = ler.nextInt(); 
		}
		
		for (i=0; i<TAM; i++) {
			if (a[i] % 2 == 0) {
				b[par] = a[i];
				par++;
			} else {
				b[impar] = a[i];
				impar--;
			}
		}
		System.out.print("\nB = [ ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		ler.close();
	}

}
