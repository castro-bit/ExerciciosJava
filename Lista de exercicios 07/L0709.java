// Gabriel de Sousa Castro
/*Fazer um programa para contar quantos espaços em branco existem em uma frase
fornecida pelo usuário. */

import java.util.Scanner;
public class L0709 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase;
        int contador = 0;

        System.out.println("Digite uma frase");
        frase = scanner.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }

        System.out.println("Quantidade de espaços em branco: " + contador);


    }
    
}
