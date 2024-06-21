/*
Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
iniciar em um dia e terminar no dia seguinte.
 */


import java.util.Scanner;
public class L0508 {
	
	public static void main (String[] args) {
		int horaInicio, horaFinal, tempoTotal ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a hora de Inicio da partida");
		horaInicio = scanner.nextInt();
		
		System.out.println("Digite a hora do Fim da partida");
		horaFinal = scanner.nextInt();
		
		tempoTotal = horaFinal - horaInicio;
		
		if(horaFinal - horaInicio >= 0 ){
		System.out.println(" O tempo total de jogo foi: " + tempoTotal);
		
		}else{
			tempoTotal +=24;
			System.out.println(" O tempo total de jogo foi: " + tempoTotal);
			
					
	}
	}
}


