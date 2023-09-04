//Faça um algoritmo que imprima "nome correto" caso o nome inserido seja o seu
package exercicios_if;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira seu nome: ");
		String nome = entrada.next();

		if (nome.equalsIgnoreCase("Rael")) {
			System.out.println("Este é o seu nome!");

		} else {
			System.out.println("Este não é o seu nome!");
		}

		entrada.close();
	}

}
