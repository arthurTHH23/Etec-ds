package prjAula04;
import java.util.Scanner;

public class CarroEconomico {
	public static void main(String[] args) {
		
		Scanner ga = new Scanner(System.in);
		
		double distanciaPerc, tanqueCombus, gastoMedio;
		
		System.out.println("digite a dist�ncia percorrida:");
		distanciaPerc = ga.nextDouble();
		
		System.out.println("digite a capacidade do seu tanque de combust�vel:");
		tanqueCombus = ga.nextDouble();
		
		gastoMedio = distanciaPerc/tanqueCombus; 
		
		System.out.println("seu gasto m�dio � "+gastoMedio);
		
		if(gastoMedio<10) {
			System.out.println("esse carro n�o � econ�mico");
		}else {
			System.out.println("esse carro � econ�mico");
		}
		ga.close();
	}

}
