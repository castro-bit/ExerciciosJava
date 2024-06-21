//Gabriel de Sousa Castro

import java.util.Scanner;


public class L0502 {
	
	public static void main (String[] args) {
		//declaração das variaveis
		int numero;
		
		//entrada de dados
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = scanner.nextInt();
		
		//processamento
		
		if (numero >= 0) {
			System.out.println("O numero é positivo");
		}else{
			System.out.println("O numero é negativo");
		}
		
		
	}
}

