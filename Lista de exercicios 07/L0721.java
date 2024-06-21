// Gabriel de Sousa Castro

/*Escreva um programa que receba uma frase, imprima cada palavras desta frase em uma
linha. */

import java.util.Scanner;
public class L0721 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        int palavras = 0;
        System.out.print("Digite uma frase: ");
        frase = scanner.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                System.out.println();
            } else {
                System.out.print(frase.charAt(i));
            }
        }
 }   
}
