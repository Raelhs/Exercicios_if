//Escreva um algoritmo que obt�m do usu�rio 3 valores inteiros representando as tr�s 
//cartas deste usu�rio em uma m�o de jogo de truco (1= AS; 2=2; 3=3; 7=7; 
//11=Valete; 12= Dama; 13= Rei).O algoritmo deve imprimir na tela a palavra 
//�TRUCO� (se APENAS UMA das tr�s cartas for AS, 2 ou 3), �SEIS� (se APENAS DUAS 
//das tr�s cartas for AS, 2 ou 3) ou �NOVE� (se AS TR�S cartas forem AS, 2 ou 3). Se 
//n�o houver AS, 2 ou 3 nas tr�s cartas, n�o � impresso nada.

package exercicios_if;

import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor da primeira carta: ");
		int carta1 = entrada.nextInt();

		System.out.print("Digite o valor da segunda carta: ");
		int carta2 = entrada.nextInt();

		System.out.print("Digite o valor da terceira carta: ");
		int carta3 = entrada.nextInt();

		entrada.close();

		int contagemCarta = 0;

		if (carta1 >= 1 && carta1 <= 3) {
			contagemCarta++;
		}

		if (carta2 >= 1 && carta2 <= 3) {
			contagemCarta++;
		}

		if (carta3 >= 1 && carta3 <= 3) {
			contagemCarta++;
		}

		if (contagemCarta == 1) {
			System.out.println("TRUCO!");
		} else if (contagemCarta == 2) {
			System.out.println("SEIS!!");
		} else if (contagemCarta == 3) {
			System.out.println("NOVE!!!!");
		}

	}

}
