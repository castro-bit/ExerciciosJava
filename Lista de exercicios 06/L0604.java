//Gabriel de Sousa Castro

/*Escreva um programa em Java para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
  Considere que o N será sempre maior que ZERO*/

import java.util.Scanner;
public class L0604 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valorN; 
		
		System.out.println("Digite o valor para N");
		valorN = scanner.nextInt();
		
		System.out.println("Os valores inteiro entre 1 e " +valorN+ ":");
		
		for(int i=1; i <= valorN; i++){
			System.out.println(i); 
		}
		
		
		
		
	}
}

