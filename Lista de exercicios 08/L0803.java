/*Escreva um programa para ler um vetor C de N posições, onde N é menor ou igual a
20 e imprimir seus elementos. O usuário deve informar o número de posições e os
elementos.*/

import java.util.Scanner;
public class L0803 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Informe o tamanho do vetor: ");
		n = scanner.nextInt();
		
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Informe o valor da posicao " + i + ": ");
			c[i] = scanner.nextInt();
		}
		System.out.println("Vetor C:");
		for (int i = 0; i < n; i++) {
			System.out.println("Posicao " + i + ": " + c[i]);
		}

	}
}

