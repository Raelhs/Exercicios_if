//Dados dois valores inteiros, escreva um algoritmo que informe 
//se eles s�o m�ltiplos ou n�o.

package exercicios_if;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o primeiro n�mero: ");
		int num1 = entrada.nextInt();

		System.out.println("Insira o segundo n�mero: ");
		int num2 = entrada.nextInt();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("S�o multiplos");

		} else {
			System.out.println("N�o s�o multiplos");
		}

		entrada.close();

	}

}
