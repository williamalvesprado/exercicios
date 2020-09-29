package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		//Executando testes com Switch
		String nivel = "79";

		switch (nivel.toLowerCase()) {

		case "80":
			System.out.println("Nível Max");
		case "70": case "79": case "78":
			System.out.println("Você passou o lvl 70");
		case "60":
			System.out.println("Você passou o lvl 60");
		case "50":
			System.out.println("Você passou o lvl 50");
		case "40":
			System.out.println("Você passou o lvl 40");
		case "30":
			System.out.println("Você passou o lvl 30");
		case "20":
			System.out.println("Você passou o lvl 20");
		case "10":
			System.out.println("Você passou o lvl 10");
		case "0":
			System.out.println("Você passou o lvl Mínimo");
			break;
		default:
			System.out.println("Vai upar seus lvl");
		}
		System.out.println("Fim");

	}

}
