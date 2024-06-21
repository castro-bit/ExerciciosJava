/*
 Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu).
 */


import java.util.Scanner;
public class L0505 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int anoNascimento;
		int anoAtual = 2024;
		
		System.out.println("Digite o ano do seu nascimento com 4 Digitos");
			anoNascimento = scanner.nextInt();
		
	if(anoAtual - anoNascimento < 16){
			System.out.println("Ainda não pode votar");
		
	}else{
		System.out.println("Pode Votar");
	}
}
}
