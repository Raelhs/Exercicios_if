//Escreva um algoritmo em que o usuário entra com um número.
//Depois ele escolhe a operação que vai ser feita com esse número
//Caso ele escolha a operação 1
//Modifique a variável do número entrado e some 10 ao número original
//Caso ele escolha a operação 2
//Modifique a variável do número entrado e subtraia 10 do número original
//Caso ele escolha a operação 3
//Modifique a variável do número entrado e multiplique 10 ao número original
//Caso ele escolha a operação 4
//Modifique a variável do número entrado e divida 10 do número original

package exercicios_if;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double numero = entrada.nextDouble();

		System.out.println("Escolha a operação:");
		System.out.println("1. Adicionar 10");
		System.out.println("2. Subtrair 10");
		System.out.println("3. Multiplicar por 10");
		System.out.println("4. Dividir por 10");
		int operacao = entrada.nextInt();

		entrada.close();

		switch (operacao) {
		case 1:
			numero += 10;
			break;
		case 2:
			numero -= 10;
			break;
		case 3:
			numero *= 10;
			break;
		case 4:
			if (numero != 0) {
				numero /= 10;
			} else {
				System.out.println("Erro: Divisão por zero não é permitida.");
				return;
			}
			break;
		default:
			System.out.println("Opção inválida.");
			return;
		}

		System.out.println("Resultado: " + numero);
	}
}