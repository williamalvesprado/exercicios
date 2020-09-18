package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		double media = 7.6;
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7;

		boolean temDesconto = bomComportamento && passouPorMedia;

		String resultado = media > 7.0 ? "Aprovado." : "em recuperação";

		String bomAluno = temDesconto != false ? "Sim." : "Não.";

		System.out.println("O aluno está " + resultado);

		System.out.println("Tem desconto? " + temDesconto);

		System.out.println("É um bom aluno? " + bomAluno);

	}

}
