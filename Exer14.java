//O índice de massa corporal (IMC) é uma medida internacional usada para calcular
//se um pessoa está no peso ideal. O IMC é determinado pela divisão da massa do 
//indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas e a altura 
//está em metros, de acordo com a fórmula:

//IMC = Massa / Altura²

//Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, 
//de acordo com a seguinte tabela:

//< 18.5 Magreza
//18.5 – 24.9 Saudável
//25.0 – 29.9 Sobrepeso
//30.0 – 34.9 Obesidade Grau I
//35.0 – 39.9 Obesidade Grau II (severa)
//> 40.0 Obesidade Grau III (morbida)

package exercicios_if;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a massa (kg): ");
		double massa = entrada.nextDouble();

		System.out.print("Digite a altura (m): ");
		double altura = entrada.nextDouble();

		entrada.close();

		double imc = massa / (altura * altura);
		String classificacao;

		if (imc < 18.5) {
			classificacao = "Magreza";
		} else if (imc < 25.0) {
			classificacao = "Saudável";
		} else if (imc < 30.0) {
			classificacao = "Sobrepeso";
		} else if (imc < 35.0) {
			classificacao = "Obesidade Grau I";
		} else if (imc < 40.0) {
			classificacao = "Obesidade Grau II (severa)";
		} else {
			classificacao = "Obesidade Grau III (mórbida)";
		}

		System.out.printf("IMC: %.2f ", imc);
		System.out.println("\nClassificação: " + classificacao);
	}
}