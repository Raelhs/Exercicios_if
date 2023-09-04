//O �ndice de massa corporal (IMC) � uma medida internacional usada para calcular
//se um pessoa est� no peso ideal. O IMC � determinado pela divis�o da massa do 
//indiv�duo pelo quadrado de sua altura, onde a massa est� em quilogramas e a altura 
//est� em metros, de acordo com a f�rmula:

//IMC = Massa / Altura�

//Fa�a um algoritmo para classificar o IMC e dizer o grau de obesidade do indiv�duo, 
//de acordo com a seguinte tabela:

//< 18.5 Magreza
//18.5 � 24.9 Saud�vel
//25.0 � 29.9 Sobrepeso
//30.0 � 34.9 Obesidade Grau I
//35.0 � 39.9 Obesidade Grau II (severa)
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
			classificacao = "Saud�vel";
		} else if (imc < 30.0) {
			classificacao = "Sobrepeso";
		} else if (imc < 35.0) {
			classificacao = "Obesidade Grau I";
		} else if (imc < 40.0) {
			classificacao = "Obesidade Grau II (severa)";
		} else {
			classificacao = "Obesidade Grau III (m�rbida)";
		}

		System.out.printf("IMC: %.2f ", imc);
		System.out.println("\nClassifica��o: " + classificacao);
	}
}