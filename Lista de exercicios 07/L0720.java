// Gabriel de Sousa Castro

/* Escreva um programa que receba uma frase, conte e imprima o número de palavras desta
frase. */


import java.util.Scanner;
public class L0720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        int palavras = 0;

        System.out.print("Digite uma frase: ");
        frase = scanner.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                palavras++;
            }
        }

        System.out.println("A frase possui " + (palavras + 1) + " palavras.");
    }
}
