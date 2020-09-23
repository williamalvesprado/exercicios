package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <=10) {
			System.out.printf("i = %d\n", contador);
			contador++;
		}

	}
/*“printf” o “f” quer dizer formato.

System.out.printf( formato, dados de saída)
Formato obviamente descreve a saída, a saída são separadas por vírgula.

Os formatos sempre começam com “%”, e como eu disse a saída são separadas por vírgulas.

%s = String
%d = Inteiro
%f = número com ponto flutuante. Na verdade o "f" representa a vírgula.
\t = tabulação
\n = salto de linha
Usando esses exemplos:

System.out.printf ("%d\t%d\t%f\t%s",5,5,254.336,"Hehe");
Saída:

5 5 254,336000*/
}

