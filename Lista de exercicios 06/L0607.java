//Gabriel de Sousa Castro

/*Escreva um programa em Java para ler um valor inteiro 
(aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.*/

import java.util.Scanner;
public class L0607{
	public static void main(String[] args) 
{
	    Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite o valor da Tabuada");
		
		int num ;
		    num = scanner.nextInt();
		    
		if (num <1 || num >10){
		    System.out.println("Digite um valor entre 1 e 10");
		}else {
		   
		for(int i=1; i<=10; i++){
		    int resultado = num * i;
		    System.out.println("A Tabuada do 8 é : " + resultado);
		}
	}
}
}
