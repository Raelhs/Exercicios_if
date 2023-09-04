//Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo 
//para ler as idades dos filhos e exibir quem é o mais velho, o irmão do meio e o caçula da família. Suponha que não 
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
			System.out.println("Marquinhos é o mais velho.");

			if (zezinhoIdade > luluzinhaIdade) {
				System.out.println("Zezinho é o irmão do meio e Luluzinha é a caçula.");

			} else {
				System.out.println("Luluzinha é a irmã do meio e Zezinho é o caçula.");
			}
		} else if (zezinhoIdade > marquinhosIdade && zezinhoIdade > luluzinhaIdade) {
			System.out.println("Zezinho é o mais velho.");

			if (marquinhosIdade > luluzinhaIdade) {
				System.out.println("Marquinhos é o irmão do meio e Luluzinha é a caçula.");
			} else {

				System.out.println("Luluzinha é a irmã do meio e Marquinhos é o caçula.");
			}
		} else {
			System.out.println("Luluzinha é a mais velha.");
			if (marquinhosIdade > zezinhoIdade) {

				System.out.println("Marquinhos é o irmão do meio e Zezinho é o caçula.");
			} else {
				System.out.println("Zezinho é o irmão do meio e Marquinhos é o caçula.");
			}
		}
	}

}
