//Elabore um algoritmo para exibir o valor de reajuste que um funcion�rio receber� no 
//seu sal�rio. A empresa ir� conceder 5% de reajuste para o funcion�rio que for 
//admitido h� menos de 12 meses. Para funcion�rio admitido entre 13 e 48 meses, ir� 
//conceder 7% de reajuste. O seu algoritmo deve solicitar ao usu�rio que digite a 
//quantidade de meses que o funcion�rio foi admitido.

package exercicios_if;

import java.util.Scanner;

public interface Exer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a quantidade de meses que o funcion�rio foi admitido: ");
		int mesesAdmitido = entrada.nextInt();

		double salarioAtual;

		System.out.print("Digite o sal�rio atual do funcion�rio: R$");
		salarioAtual = entrada.nextDouble();

		entrada.close();

		double reajuste = 0.0;

		if (mesesAdmitido < 12) {
			reajuste = salarioAtual * 0.05;
		} else if (mesesAdmitido >= 13 && mesesAdmitido <= 48) {
			reajuste = salarioAtual * 0.07;
		}

		double novoSalario = salarioAtual + reajuste;

		System.out.printf("Valor do reajuste: R$%.2f ", reajuste);
		System.out.println("\nNovo sal�rio: R$" + novoSalario);
	}

}
