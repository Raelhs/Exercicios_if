//Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva 
//um algoritmo que calcule a média de aproveitamento e o conceito do aluno.
//Usando a fórmula: média de aproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7
//A atribuição dos conceitos obedece à tabela abaixo:

//média de aproveitamento conceito
//>= 9.0 A
//>= 7.5 e < 9.0 B
//>= 6.0 e < 7.5 C
//>= 4.0 e < 6.0 D
//< 4.0 E

//O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e 
//a mensagem ‘aprovado’ caso o conceito seja A, B ou C, e ‘reprovado’ caso o conceito 
//seja D ou E

package exercicios_if;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota da Prova 1: ");
		double notaProva1 = entrada.nextDouble();

		System.out.print("Digite a nota da Prova 2: ");
		double notaProva2 = entrada.nextDouble();

		System.out.print("Digite a nota da Prova 3: ");
		double notaProva3 = entrada.nextDouble();

		System.out.print("Digite a média dos exercícios: ");
		double notaExercicios = entrada.nextDouble();

		entrada.close();

		double mediaAproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

		String conceito;
		if (mediaAproveitamento >= 9.0) {
			conceito = "A";
		} else if (mediaAproveitamento >= 7.5) {
			conceito = "B";
		} else if (mediaAproveitamento >= 6.0) {
			conceito = "C";
		} else if (mediaAproveitamento >= 4.0) {
			conceito = "D";
		} else {
			conceito = "E";
		}

		System.out.printf("Média de Aproveitamento: %.2f" , mediaAproveitamento);
		System.out.println("\nConceito: " + conceito);

		if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
