package prjTreinoVetores;
import java.util.Scanner;

public class VetorDivisor {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int a[], i, n;
		a = new int [TAM];
		
		for (i=0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+"o número do vetor A");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i < TAM; i++) {
			System.out.print("Os divisores do "+a[i]+" são: ");
			for (n=1; n <= a[i]; n++) {
				if (a[i] % n == 0) {
				System.out.print(n+" ");
				}
			}
			System.out.println();
		}

		ler.close();
	}

}
