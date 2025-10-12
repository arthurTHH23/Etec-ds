package prjAula04;
import java.util.Scanner;

public class irpfSalario {
	public static void main(String[] args) {
		
		Scanner ga = new Scanner(System.in);
		
		double salario, irpf;
		
		System.out.println("Digite o seu sal�rio:");
		salario = ga.nextDouble();
		
		if (salario<1434.60) {
			System.out.println("Voc� n�o tem IRPF");
		} else if (salario<=2150.00) {
            irpf = salario*0.075-107.59;
            System.out.println("Seu IRPF � "+irpf);
		} else if (salario<=2886.70) {
			irpf = salario*0.15-268.84;
			System.out.println("Seu IRPF � "+irpf);
		} else if (salario<=3582.00){
			irpf = salario*0.225-483.84;
			System.out.println("Seu IRPF � "+irpf);
		} else {
			irpf = salario*0.275-662.94;
			System.out.println("Seu IRPF � "+irpf);
		}
		
		ga.close();
	}

}
