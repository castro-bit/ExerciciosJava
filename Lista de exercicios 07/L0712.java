// Gabriel de Sousa Castro

/*12) Escreva um programa que conta e exibe a quantidade de vezes que cada vogal ocorre em
uma frase fornecida pelo usuário.*/

import java.util.Scanner;
public class L0712 {
	
	public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int contA = 0,contE = 0,contI = 0, contO = 0, contU = 0;
	char vogal;
	String frase;
	
	System.out.println("Digite uma frase");
	frase = scanner.nextLine().toLowerCase();
	
	for(int i = 0 ; i < frase.length(); i++){
		vogal = frase.charAt(i);
		
		switch (vogal) {
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;
                default:
                    break;
            }
        }

        // Exibe a contagem de cada vogal
        System.out.println("Quantidade de cada vogal:");
        System.out.println("A: " + contA);
        System.out.println("E: " + contE);
        System.out.println("I: " + contI);
        System.out.println("O: " + contO);
        System.out.println("U: " + contU);
    }
}
		


