package fundamentos;

import java.util.Scanner;

public class TiposStrinfEquals {

	public static void main(String[] args) {

		// Comparando Strings "true"
		System.out.println("2" == "2");

		// Comparando String com variavel do tipo String "false"
		String s1 = new String("2");
		System.out.println("2" == s1);
		// ao utilizar o .equals ele corrige o metodo que nao le o conteúdo da variavel.
		System.out.println("2".equals(s1));

		Scanner entrada = new Scanner(System.in);

		String s2 = entrada.next();
		// O comando .trim remove os espaços em branco na entrada do Scanner
		System.out.println("2".contentEquals(s2.trim()));

		entrada.close();
		
		//**Tomar cuidado ao fazer comparações de String

	}

}
