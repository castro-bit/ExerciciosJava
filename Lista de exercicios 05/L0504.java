/*Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
também a média calculada.*/

import java.util.Scanner;
public class L0504{
	
	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	int primeiraNota, segundaNota;
	double media;
	
	System.out.println("Digite a primeira nota");
		primeiraNota = scanner.nextInt();
	
	System.out.println("Digite a segunda nota");
		segundaNota = scanner.nextInt();	
	
	media = (primeiraNota + segundaNota) /2 ;
	
	if (media >=6){
	System.out.println("Sua Média é : " + media +  " Aluno Aprovado");
	
	}else{
		System.out.println("Sua Média é : " + media +  " Aluno Reprovado");
	
	}
	
	
}
}

