package curso_programacao;

import java.util.Scanner;

public class whille {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int tentativas = 0;

		while (x != 0) {
			x = sc.nextInt();
			System.out.println("outro numero:");
			tentativas +=1;
			
		}

		System.out.println("achou");
		System.out.printf("numero de tentativas até acertar:%d",tentativas);
		
		sc.close();
	}

}
