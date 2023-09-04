//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que 
//trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular ]	//com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas 
//trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário, 
//que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere 
//que o mês possua 4 semanas exatas)

package exercicios_if;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double horasTrabalhadas;
		double valorPorHora;

		System.out.print("Digite o número de horas trabalhadas em um mês: ");
		horasTrabalhadas = entrada.nextDouble();

		System.out.print("Digite o valor por hora: R$");
		valorPorHora = entrada.nextDouble();

		entrada.close();

		double salarioTotal = 0.0;

		if (horasTrabalhadas <= 160) {
			salarioTotal = horasTrabalhadas * valorPorHora;
		} else {
			double horasExtras = horasTrabalhadas - 160;
			salarioTotal = (160 * valorPorHora) + (horasExtras * valorPorHora * 1.5);
		}

		System.out.printf("Salário total do funcionário: R$%.2f" ,salarioTotal);
	}

}
