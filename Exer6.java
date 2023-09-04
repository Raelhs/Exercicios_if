//Dada a idade de um nadador descreva um algoritmo que o classifique em uma das 
//seguintes categorias:
//pré-mirim 5 - 7 anos
//mirim 8 - 10 anos
//infantil 11 - 13 anos
//infanto-juvenil 14 - 17 anos
//juvenil 18 - 20 anos
//adulto maiores de 21 anos

package exercicios_if;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira sua idade: ");
		int idade = entrada.nextInt();

		String categoria;

		entrada.close();

		if (idade >= 5 && idade <= 7) {
			categoria = "Pré-Mirim";
		} else if (idade >= 8 && idade <= 10) {
			categoria = "Mirim";
		} else if (idade >= 11 && idade <= 13) {
			categoria = "Infantil";
		} else if (idade >= 14 && idade <= 17) {
			categoria = "Infanto-Juvenil";
		} else if (idade >= 18 && idade <= 20) {
			categoria = "Juvenil";
		} else {
			categoria = "Adulto";
		}

		System.out.println("O nadador pertence à categoria: " + categoria);
	}

}
