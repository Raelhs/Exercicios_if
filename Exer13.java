//Um casal possui tr�s filhos: Marquinhos, Zezinho e Luluzinha. Fa�a um algoritmo 
//para ler as idades dos filhos e exibir quem � o mais velho, o irm�o do meio e o ca�ula da fam�lia. Suponha que n�o 
//haja empates.

package exercicios_if;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a idade de Marquinhos: ");
		int marquinhosIdade = entrada.nextInt();

		System.out.print("Digite a idade de Zezinho: ");
		int zezinhoIdade = entrada.nextInt();

		System.out.print("Digite a idade de Luluzinha: ");
		int luluzinhaIdade = entrada.nextInt();

		entrada.close();

		if (marquinhosIdade > zezinhoIdade && marquinhosIdade > luluzinhaIdade) {
			System.out.println("Marquinhos � o mais velho.");

			if (zezinhoIdade > luluzinhaIdade) {
				System.out.println("Zezinho � o irm�o do meio e Luluzinha � a ca�ula.");

			} else {
				System.out.println("Luluzinha � a irm� do meio e Zezinho � o ca�ula.");
			}
		} else if (zezinhoIdade > marquinhosIdade && zezinhoIdade > luluzinhaIdade) {
			System.out.println("Zezinho � o mais velho.");

			if (marquinhosIdade > luluzinhaIdade) {
				System.out.println("Marquinhos � o irm�o do meio e Luluzinha � a ca�ula.");
			} else {

				System.out.println("Luluzinha � a irm� do meio e Marquinhos � o ca�ula.");
			}
		} else {
			System.out.println("Luluzinha � a mais velha.");
			if (marquinhosIdade > zezinhoIdade) {

				System.out.println("Marquinhos � o irm�o do meio e Zezinho � o ca�ula.");
			} else {
				System.out.println("Zezinho � o irm�o do meio e Marquinhos � o ca�ula.");
			}
		}
	}

}
