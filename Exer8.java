//Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma 
//mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. 
//Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro 
//diferente dos demais, e apenas irmãos se todas as idades forem diferentes.

package exercicios_if;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o ano de nascimento do primeiro irmão: ");
		int ano1 = entrada.nextInt();

		System.out.print("Digite o ano de nascimento do segundo irmão: ");
		int ano2 = entrada.nextInt();

		System.out.print("Digite o ano de nascimento do terceiro irmão: ");
		int ano3 = entrada.nextInt();

		entrada.close();

		if (ano1 == ano2 && ano2 == ano3) {
			System.out.println("Eles são trigêmeos.");
		} else if ((ano1 == ano2 && ano2 != ano3) || (ano1 == ano3 && ano3 != ano2) 
				|| (ano2 == ano3 && ano3 != ano1)) {
			System.out.println("Eles são gêmeos.");
		} else {
			System.out.println("Eles são apenas irmãos.");
		}
	}
}
