package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		System.out.print("Qual o dia da semana? ");

		String dia = entrada.next();

		if (dia == "domingo") {
			System.out.println("Domingo equivale a 1.");
		} 
		else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("Segunda equivale a 2.");
		} 
		else if (dia.equalsIgnoreCase("terça") 
				||dia.equalsIgnoreCase("terca")) {
			System.out.println("Terça equivale a 3.");
		} 
		else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("Quarta equivale a 4.");
		} 
		else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("Quinta equivale a 5.");
		} 
		else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("Sexta equivale a 6.");
		} 
		else if (dia.equalsIgnoreCase("sábado")
				||dia.equalsIgnoreCase("sabado")) {
			System.out.println("Sabado equivale a 7.");
		} 
		else
			System.out.println("Dia inválido");

		System.out.println("Fim!");
		entrada.close();
	}
}
