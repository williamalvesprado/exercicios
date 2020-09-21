package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();

		// "if" utilizada como condição para execução de fluxo
		// Exemplo: "SE x for falso, execute Y"
		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado, Parabéns.");

			if (media >= 9.0) {
				System.out.println("Quadro de Honra!");
				System.out.println("Você é fera!");
			}
		}
		// Exemplo de uso da condição
		// Se a média for menor que sete e maior que 4.5
		// imprima na tela a msg "Recuperação"
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");

			boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;

			if (criterioReprovacaoAtingido) {
				System.out.println("Reprovado");
			}

			entrada.close();

		}
	}
}
