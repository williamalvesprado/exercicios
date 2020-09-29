package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();

		//mais exmplos de Switch/case
		switch (nota) {
		case 10:
			conceito = "A, Parabéns foi foi aprovado!";
			break;
		case 9:
			conceito = "A-, Parabéns foi foi aprovado!";
			break;
		case 8:
			conceito = "B, Parabéns foi foi aprovado, mas pode melhorar.";
			break;
		case 7:
			conceito = "B-, ,Parabéns foi foi aprovado, mas pode melhorar.";
			break;
		case 6:
		case 5:
			conceito = "C, Parabéns foi foi aprovado, você pode fazer melhor que isso.";
			break;
		case 4:
		case 3:
			conceito = "D, você foi reprovado, precisa se dedicar mais.";
			break;
		case 2:
		case 1:
			conceito = "E, você foi reprovado, precisa se dedicar mais";
			break;
		case 0:
			conceito = "F, isso foi inaceitável.";
			break;
		default:
			conceito = "Não informado!";

		}

		System.out.println("Conceito é:  " + conceito);
		entrada.close();
	}

}
