// Gabriel de Sousa Castro

/*
Escreva um programa que calcule e escreva a quantidade de vezes que o
caractere ‘a’ aparece em uma frase fornecida pelo usuário. Nota Importante: para a
contagem, o caractere pode ser maiúsculo ou minúsculo.
 */

import java.util.Scanner;

public class L0705 {

	public static void main(String[] args) {
		String palavra;
		int contador = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		palavra = scanner.nextLine();

		for (int i = 0; i < palavra.length(); i++) {
			char caractereAtual = palavra.charAt(i);
			if (caractereAtual == 'a' || caractereAtual == 'A') {
				contador++;
			}
		}

		System.out.println("O caractere 'a' aparece " + contador + " vezes na frase.");

	}
}
