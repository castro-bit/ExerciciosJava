// Gabriel de Sousa Castro

/*Escreva um programa que imprima o número de consoantes de uma frase fornecida pelo
usuário.*/

import java.util.Scanner;

public class L0713 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        int consoantes = 0;

        System.out.print("Digite uma frase: ");
        frase = input.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                if (frase.charAt(i) != 'a' && frase.charAt(i) != 'e' && frase.charAt(i) != 'i' && frase.charAt(i) != 'o'
                        && frase.charAt(i) != 'u') {
                    consoantes++;
                }
            }
        }

        System.out.println("A frase tem " + consoantes + " consoantes.");
    }
}