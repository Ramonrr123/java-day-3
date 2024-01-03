package curso_programacao;

import java.util.Locale;

public class main {

	public static void main(String[] args) {
	
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		double x = 10.35784;
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.println("resultado da metragem é " + x + " metros");
		System.out.printf("resultado é %.2f mestros%n ", x);
		System.out.printf("%s tem %d anos e ganha %.2f reais %n", nome,idade, renda);
	}

}
