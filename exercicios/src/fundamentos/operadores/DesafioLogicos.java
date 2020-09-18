package fundamentos.operadores;

public class DesafioLogicos {

	/*
	 * Tenho dois trabalho em vista um na terça e outro na quinta se ambos derem
	 * certo, comprarei uma TV de 50" para a familia porém, se apenas um trabalho
	 * der certo, comprei uma TV de 32", e se acaso eu comprar uma TV levo também a
	 * familia para tomar sorvete.
	 */
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		//Operadores Binários
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//operador Unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("Comprou TV 32\"?" + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("mais saudável? " + maisSaudavel);
	
		
		
		
			
		
		
				
		
	}

}
