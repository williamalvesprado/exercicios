package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o numero: ");
		int numero = Integer.parseInt(valor);

		//if = se numero for PAR escreva na tela "Número par!
		//else = CASO CONTRÁRIO escreva na tela "Número ímpar
		if (numero % 2 == 0) {
			System.out.println("Número par!");

		} else {
			System.out.println("Número ímpar!");
		}
	}

}
