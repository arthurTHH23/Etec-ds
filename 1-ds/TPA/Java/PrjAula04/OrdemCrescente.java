package prjAula04;
import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		
		Scanner ga = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("digite o valor de A:");
		a = ga.nextDouble();
		
		System.out.println("digite o valor de B:");
		b = ga.nextDouble();
		
		System.out.println("digite o valor de C:");
		c = ga.nextDouble();
		
		if (a<=b && b<=c) {
			System.out.println("A sequ�ncia � "+a+", "+b+", "+c);
		} else if (a<=c && c<=b) {
			System.out.println("A sequ�ncia � "+a+","+c+", "+b);
		} else if (b<=a && a<=c) {
			System.out.println("A sequ�ncia � "+b+", "+a+", "+c);
		} else if (b<=c && c<=a) {
			System.out.println("A sequ�ncia � "+b+", "+c+", "+a);
		} else if (c<=a && a<=b) {
			System.out.println("A sequ�ncia � "+c+", "+a+", "+b);
		} else {
			System.out.println("A sequ�ncia � "+c+", "+b+", "+a);
		}
		
		ga.close();

	}

}
