package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog("Digite o primeiro numero");
		
		System.out.println("Sua primeira nota  é "+ valor1 + "\nSua segunda nota é " + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1+ numero2;
		System.out.println("\n\nA soma das suas notas é " + soma);
		System.out.println("Sua média é " + soma / 2);
		
	
		
		
		
	}

}
