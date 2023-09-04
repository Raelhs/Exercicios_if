//Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a 
//idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a soma 
//das idades do homem mais velho com a mulher mais nova, e o produto das idades 
//do homem mais novo com a mulher mais velha.

package exercicios_if;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a idade do primeiro homem: ");
		int idadeHomem1 = entrada.nextInt();

		System.out.print("Digite a idade da primeira mulher: ");
		int idadeMulher1 = entrada.nextInt();

		System.out.print("Digite a idade do segundo homem: ");
		int idadeHomem2 = entrada.nextInt();

		System.out.print("Digite a idade da segunda mulher: ");
		int idadeMulher2 = entrada.nextInt();

		entrada.close();

		int homemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
		int homemMaisNovo = Math.min(idadeHomem1, idadeHomem2);
		int mulherMaisNova = Math.min(idadeMulher1, idadeMulher2);
		int mulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);

		int somaIdades = homemMaisVelho + mulherMaisNova;
		int produtoIdades = homemMaisNovo * mulherMaisVelha;

		System.out.println("Soma das idades do homem mais velho com a" 
		+ " mulher mais nova: " + somaIdades);
		System.out.println("Produto das idades do homem mais novo com a mulher" 
		+ " mais velha: " + produtoIdades);
	}

}
