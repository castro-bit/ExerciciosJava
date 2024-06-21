//Gabriel de Sousa Castro
/*Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a
média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
Ao final da execução a mensagem 'NOVO CÁLCULO (S/N)?' deve ser apresentada. Se for respondido 'S' deve
retornar e executar um novo cálculo, caso contrário deverá encerrar o programa.

 */


import java.util.Scanner;
public class L0617 {
	
	public static void main (String[] args) {
		Scanner texto = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		int nota1 , nota2, media;
		String resposta;
		char resp;
		
		
		do {
			System.out.println("Digite a Primeira nota");
			nota1 = scanner.nextInt();
			
			System.out.println("Digite a Segunda nota");
			nota2 = scanner.nextInt();
			
			if((nota1 >= 0 && nota1 <= 10)&& (nota2 >=0 && nota2 <= 10 )){
				media = (nota1 + nota2)/2;
				System.out.println("A media dos alunos é " + media + ".");
			}else{
				System.out.println("As notas devem estar em 0 e 10");
			}
			
			System.out.println("Deseja realizar outro calculo? S/N");
			resposta = texto.nextLine();
			resp= resposta.charAt(0);
		
		}while (resp == 'S');
			
		
		
	}
}




