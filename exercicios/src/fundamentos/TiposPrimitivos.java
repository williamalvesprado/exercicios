package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações de funcionarios.
		
		// Tipos numéricos inteiros.
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosDeVooAcumulado = 3_134_845_223L;
		
		// Tipos numéricos reais.
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleanos
		boolean estaDeFerias = false; // ou true
		
		//Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosDeVooAcumulado / vendasAcumuladas);
		
		System.out.println(id + ":ganha -->"+ salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: " +status);
		

		
		
		
	}

}
