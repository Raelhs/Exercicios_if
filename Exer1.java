//Dados dois n�meros inteiros 
//distintos descreva um algoritmo para informar o maior valor entre eles.

package exercicios_if;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o primeiro n�mero: ");
		int num1 = entrada.nextInt();

		System.out.println("Insira o segundo n�mero: ");
		int num2 = entrada.nextInt();

		if (num1 > num2) {
			System.out.println("O maior n�mero � o: " + num1);

		} else {
			System.out.println("O maior n�mero � o: " + num2);
		}

		entrada.close();

	}

}
