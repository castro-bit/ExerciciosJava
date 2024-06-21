/*
Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrevê-los em ordem crescente.
 */


import java.util.Scanner;
public class L0507 {
	
	public static void main (String[] args) {
		int valor1, valor2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro Valor");
		valor1 = scanner.nextInt();
		
		System.out.println("Digite o Segundo Valor");
		valor2 = scanner.nextInt();
		
		if(valor1 == valor2){
			System.out.println("Os valores não podem se iguais");
		
		}else if (valor1 < valor2){
		System.out.println("Os valores são : " + valor1 +" e "+ valor2 + ".");
		
		}else{
			System.out.println("Os valores são : " + valor2 +" e " + valor1 +"." );
	}
}
}

