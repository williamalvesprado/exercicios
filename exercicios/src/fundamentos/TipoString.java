package fundamentos;

public class TipoString {

	// .charAt = identifica a posição na string, no caso no local "2" está a letra
	// "á"
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";
		// .concat = tem a mesma função do + que é concatenar a string
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");

		// .starsWith = confirma se a palavra começa da forma que foi escrit na
		// variavel, só retorna true, false
		System.out.println(s.startsWith("Boa"));
		// .toLwerCase = altera toda variavel para letras minusculas
		System.out.println(s.toLowerCase().startsWith("boa"));
		// .toUpperCase = altera toda a variavel para letras maiuscula
		// .endsWith = confirma o final da variavel, s+o retorna true/ false
		System.out.println(s.toUpperCase().endsWith("Tarde"));
		// .length = mostra quantos caracteres tem uma string
		System.out.println(s.length());
		// .equals = faz comparação de igualdade
		System.out.println(s.equals("Boa tarde"));
		// .equalsIgnoreCase = ignora se se a string é maiuscula ou minuscula
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		var nome = "William";
		var sobrenome = "Prado";
		var idade = 38;
		var salario = 12345.987;
		
		// \n = este comando serve para alocar a raviavel na linha de baixo
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		// % = junto com a inicial do tipo primitivo ele mostra pela ordem o valor da variavel
		System.out.printf("O senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
	}

}
