//Dados dois números inteiros 
//distintos descreva um algoritmo para informar o maior valor entre eles.

package exercicios_if;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o primeiro número: ");
		int num1 = entrada.nextInt();

		System.out.println("Insira o segundo número: ");
		int num2 = entrada.nextInt();

		if (num1 > num2) {
			System.out.println("O maior número é o: " + num1);

		} else {
			System.out.println("O maior número é o: " + num2);
		}

		entrada.close();

	}

}
