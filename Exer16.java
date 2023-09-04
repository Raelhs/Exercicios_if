//Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no 
//seu salário. A empresa irá conceder 5% de reajuste para o funcionário que for 
//admitido há menos de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá 
//conceder 7% de reajuste. O seu algoritmo deve solicitar ao usuário que digite a 
//quantidade de meses que o funcionário foi admitido.

package exercicios_if;

import java.util.Scanner;

public interface Exer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a quantidade de meses que o funcionário foi admitido: ");
		int mesesAdmitido = entrada.nextInt();

		double salarioAtual;

		System.out.print("Digite o salário atual do funcionário: R$");
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
		System.out.println("\nNovo salário: R$" + novoSalario);
	}

}
