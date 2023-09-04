//A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que 
//trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular ]	//com um acr�scimo de 50%. Escreva um algoritmo que leia o n�mero de horas 
//trabalhadas em um m�s, o valor por hora e escreva o sal�rio total do funcion�rio, 
//que dever� ser acrescido das horas extras, caso tenham sido trabalhadas (considere 
//que o m�s possua 4 semanas exatas)

package exercicios_if;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double horasTrabalhadas;
		double valorPorHora;

		System.out.print("Digite o n�mero de horas trabalhadas em um m�s: ");
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

		System.out.printf("Sal�rio total do funcion�rio: R$%.2f" ,salarioTotal);
	}

}
