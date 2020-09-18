package fundamentos;

public class NotacaPonto {

	public static void main(String[] args) {
		
		// extenções que podem ser atribuitas aos métodos.
		String s = "Bom dia X";
		s = s.replace("Mundo", "Homem");
		s = s.toUpperCase();
		s = s.concat("!!!");
				
		System.out.println(s);
		
		String x ="Will".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Will")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não podem receber extenções

	}

}
