package prjAula04;
import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
		
		Scanner ga = new Scanner (System.in);
		
		double anoNasc, anoAtual, idade;
		
		System.out.println("digite o seu ano de nascimento:");
		anoNasc = ga.nextDouble();
		
		System.out.println("digite o ano atual:");
	    anoAtual = ga.nextDouble();
	    
	    idade = anoAtual-anoNasc;
	    
	    System.out.println("a sua idade � "+idade);
	    
	    if(idade<10) {
	    	System.out.println("voc� � crian�a");
	    }else if(idade<18) {
	    	System.out.println("voc� � adolescente");
	    }else if(idade<60) {
	    	System.out.println("voc� � adulto");
	    }else {
	    	System.out.println("voc� � idoso");
	    }	
        ga.close();
	}

}
