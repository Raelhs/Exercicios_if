//Leia uma data (dia, mês e ano) e determine se ela é válida.
//Lembre dos anos bissextos!
package exercicios_if;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int dia;
		int mes = 0;
		int ano = 0;
		boolean dataValida = false;

		System.out.println("Insira o dia: ");
		dia = input.nextInt();

		if (dia >= 1 && dia <= 31) {

			System.out.println("Insira o mês: ");
			mes = input.nextInt();

			if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30
					|| (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
					|| mes == 2 && dia <= 29) {

				System.out.println("Insira o ano: ");
				ano = input.nextInt();
				dataValida = true;

				input.close();

				if ((mes == 2 && dia == 29 && ano % 4 != 0)) {
					dataValida = false;
				}

			}

		}
		if (dataValida == true) {
			System.out.println("Data válida: " + dia + "/" + mes + "/" + ano);
		} else {
			System.out.println("Data inválida");
		}

	}
}
