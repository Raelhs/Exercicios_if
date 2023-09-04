//Faça uma calculadora.
//O usuário entra com dois números e depois com a operaçao desejada.
//Caso o número da operação seja 1: some os dois números.
//Caso seja 2: subtraia os dois números.
//Caso seja 3: multiplique os dois números.
//Caso seja 4: divida os dois números.

package exercicios_if;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();

		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();

		System.out.println("Escolha a operação:");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");

		int operacao = entrada.nextInt();

		entrada.close();

		double resultado = 0.0;

		switch (operacao) {
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		case 4:
			if (num2 != 0) {
				resultado = num1 / num2;
			} else {
				System.out.println("Erro: Divisão por zero não é permitida.");
				return;
			}
			break;
		default:
			System.out.println("Opção inválida.");
			return;
		}

		System.out.println("Resultado: " + resultado);

	}

}
