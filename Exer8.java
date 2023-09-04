//Escreva um algoritmo para ler o ano de nascimento de 3 irm�os, escrever uma 
//mensagem que indique se eles s�o TRIG�MEOS, G�MEOS, APENAS IRM�OS. 
//Considere que eles s�o G�MEOS se dois deles possuem a mesma idade e o outro 
//diferente dos demais, e apenas irm�os se todas as idades forem diferentes.

package exercicios_if;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o ano de nascimento do primeiro irm�o: ");
		int ano1 = entrada.nextInt();

		System.out.print("Digite o ano de nascimento do segundo irm�o: ");
		int ano2 = entrada.nextInt();

		System.out.print("Digite o ano de nascimento do terceiro irm�o: ");
		int ano3 = entrada.nextInt();

		entrada.close();

		if (ano1 == ano2 && ano2 == ano3) {
			System.out.println("Eles s�o trig�meos.");
		} else if ((ano1 == ano2 && ano2 != ano3) || (ano1 == ano3 && ano3 != ano2) 
				|| (ano2 == ano3 && ano3 != ano1)) {
			System.out.println("Eles s�o g�meos.");
		} else {
			System.out.println("Eles s�o apenas irm�os.");
		}
	}
}
