package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_celular {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a quantidade de minutos");
		
		int minutos = sc.nextInt();
		
		double plano = 50.00;
		
		if(minutos >100 ) {
			plano = plano + ((minutos -100)* 2.0) ; 
			System.out.printf("o valor a pagar é R$ %.2f%n",plano);
		}else {
			System.out.println("o valor da sua conta deu R$50,00");
		}
		
		
		
	}

}
