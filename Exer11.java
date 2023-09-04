//Escreva um algoritmo em que o usu�rio entra com um n�mero.
//Depois ele escolhe a opera��o que vai ser feita com esse n�mero
//Caso ele escolha a opera��o 1
//Modifique a vari�vel do n�mero entrado e some 10 ao n�mero original
//Caso ele escolha a opera��o 2
//Modifique a vari�vel do n�mero entrado e subtraia 10 do n�mero original
//Caso ele escolha a opera��o 3
//Modifique a vari�vel do n�mero entrado e multiplique 10 ao n�mero original
//Caso ele escolha a opera��o 4
//Modifique a vari�vel do n�mero entrado e divida 10 do n�mero original

package exercicios_if;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		double numero = entrada.nextDouble();

		System.out.println("Escolha a opera��o:");
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
				System.out.println("Erro: Divis�o por zero n�o � permitida.");
				return;
			}
			break;
		default:
			System.out.println("Op��o inv�lida.");
			return;
		}

		System.out.println("Resultado: " + numero);
	}
}