package controle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		System.out.print("Digite a nota: ");

		double nota = entrada.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida!");
		} else if (nota >= 8.1) {
			System.out.println("Seu conceito é A");
			System.out.println("Parabéns você está aprovado!");
		} else if (nota >= 6.1) {
			System.out.println("Seu conceito é B");
			System.out.println("Parabéns você está aprovado!");
		} else if (nota >= 4.1) {
			System.out.println("Seu conceito é C");
			System.out.println(" Será necessário melhorar sua média!");
		} else if (nota >= 2.1) {
			System.out.println("Seu conceito é D, ");
			System.out.println("Você foi reprovado.");
		} else {
			System.out.println("Seu conceito é E");
			System.out.println("Você foi reprovado.");
		}

		System.out.println("Fim!");
		entrada.close();
	}

}
