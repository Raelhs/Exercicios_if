//Faça um algoritmo que leia um caractere.
//Caso seja digitada a letra 'M' escreva “Masculino”.
//Se for digitada a letra 'F' escreva “Feminino”.
//Se for informado 'I' escreva “Não Informado”.
//Qualquer outra letra digitada escreva “Entrada Incorreta”.

package exercicios_if;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("M = Masculino" + "\nF = Feminino" + "\nI = Não informado");
		System.out.print("Digite um caractere: ");
		char caractere = entrada.next().charAt(0);

		caractere = Character.toUpperCase(caractere);

		entrada.close();

		if (caractere == 'M') {
			System.out.println("Masculino");
		} else if (caractere == 'F') {
			System.out.println("Feminino");
		} else if (caractere == 'I') {
			System.out.println("Não Informado");
		} else {
			System.out.println("Entrada Incorreta");
		}
	}

}
