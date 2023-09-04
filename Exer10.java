//Fa�a uma calculadora.
//O usu�rio entra com dois n�meros e depois com a opera�ao desejada.
//Caso o n�mero da opera��o seja 1: some os dois n�meros.
//Caso seja 2: subtraia os dois n�meros.
//Caso seja 3: multiplique os dois n�meros.
//Caso seja 4: divida os dois n�meros.

package exercicios_if;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		double num1 = entrada.nextDouble();

		System.out.print("Digite o segundo n�mero: ");
		double num2 = entrada.nextDouble();

		System.out.println("Escolha a opera��o:");
		System.out.println("1. Soma");
		System.out.println("2. Subtra��o");
		System.out.println("3. Multiplica��o");
		System.out.println("4. Divis�o");

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
				System.out.println("Erro: Divis�o por zero n�o � permitida.");
				return;
			}
			break;
		default:
			System.out.println("Op��o inv�lida.");
			return;
		}

		System.out.println("Resultado: " + resultado);

	}

}
