//Dadas as coordenadas (X e Y) 
//de um Ponto, você deve informar em qual quadrante ele está localizado
package exercicios_if;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a coordenada X do ponto: ");
		double x = entrada.nextDouble();

		System.out.print("Digite a coordenada Y do ponto: ");
		double y = entrada.nextDouble();

		entrada.close();

		if (x > 0 && y > 0) {
			System.out.println("O ponto está no primeiro quadrante.");
		} else if (x < 0 && y > 0) {
			System.out.println("O ponto está no segundo quadrante.");
		} else if (x < 0 && y < 0) {
			System.out.println("O ponto está no terceiro quadrante.");
		} else if (x > 0 && y < 0) {
			System.out.println("O ponto está no quarto quadrante.");
		} else if (x == 0 && y != 0) {
			System.out.println("O ponto está sobre o eixo Y.");
		} else if (y == 0 && x != 0) {
			System.out.println("O ponto está sobre o eixo X.");
		} else {
			System.out.println("O ponto está na origem (0, 0).");
		}
	}

}
