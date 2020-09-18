package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b (c recebe C mais b)
		c -= a; //c = c - a (c recebe c menos a)
		c *= b; //c = c * b (c recebe c e multiplica por b)
		c /= a; //c = c / a (c recebe c e divide por a)
		
		System.out.println(c);
		
		c %= 2; //c = c % 2 (c recebe c e MODULA (retorna se a variavel é par 0 ou impar 1)
		
		System.out.println(c);
		
		
	}

}
