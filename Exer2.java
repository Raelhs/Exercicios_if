//Dados dois valores inteiros, escreva um algoritmo que informe 
//se eles são múltiplos ou não.

package exercicios_if;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o primeiro número: ");
		int num1 = entrada.nextInt();

		System.out.println("Insira o segundo número: ");
		int num2 = entrada.nextInt();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São multiplos");

		} else {
			System.out.println("Não são multiplos");
		}

		entrada.close();

	}

}
