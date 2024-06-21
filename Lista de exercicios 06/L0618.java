//Gabriel de Sousa Castro
/* Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa em
Java que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o
valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias.*/

import java.util.Scanner;
public class L0618{
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
			int total, i ;
			double valor , valorTotal, media;
			valorTotal = 0;
			media = 0;
		
		System.out.println("Digite o numero total de mercadorias no estoque");
		total = scanner.nextInt();
		
		for(i = 1; i <= total; i++){
			System.out.println("Digite o valor do Produto");
			valor = scanner.nextDouble();
			
			valorTotal = valor * total;
			
			media = valorTotal / total;
		
	}
		System.out.println("O valor total das mercadorias é " + valorTotal + ".");
		System.out.println("A media dos valores é " + media + ".");
		
		
	}
} 

