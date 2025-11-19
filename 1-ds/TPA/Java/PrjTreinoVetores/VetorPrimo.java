package prjTreinoVetores;
import java.util.Scanner;

public class VetorPrimo {

	public static void main(String[] args) {
			
			Scanner ler = new Scanner (System.in);
			final int TAM=10;
			int a[], primo, i, n;
			a = new int [TAM];
			
			for (i=0; i < TAM; i++) {
				System.out.println("Digite o valor "+(i+1)+" do vetor A");
				a[i] = ler.nextInt();
			}
			
			for (i=0; i < TAM; i++) {
				primo = 1;
				if (a[i] < 2) {
					primo = 0;
				} else {
					for (n=2; n <= a[i]/2; n++) {
						if (a[i]%n == 0) {
							primo = 0;
						}
					}
				}
				if (primo == 1) {
				    System.out.println(a[i]+" é primo");
				} else {
				    System.out.println(a[i]+" não é primo");
				}
			}
			ler.close();
	}

}
