package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class escaner {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);

		System.out.println("digite o codigo do produto");
		int codigo;
		codigo = sc.nextInt();
		int qtd;
		qtd = sc.nextInt();
		
		
		if(codigo ==1 ) {
			double preco= qtd * 4.00;
			System.out.println("o valor da sua comanda é "+ preco +" reais");
		}else if(codigo == 2) {
			double preco = qtd * 4.50;
			System.out.println("o valor da sua comanda é "+ preco +" reais");
		}else if(codigo == 3) {
			double preco = qtd * 5;
			System.out.println("o valor da sua comanda é "+ preco +" reais");
		}else if(codigo == 4) {
			double preco = qtd * 2;
			System.out.println("o valor da sua comanda é "+ preco +" reais");
		}else if(codigo == 5) {
			double preco = qtd * 1.50;
			System.out.println("o valor da sua comanda é "+ preco +" reais");
		}
		sc.close();
	}

}

