// Gabriel de Sousa Castro

/* Escreva um programa que leia duas frases e a seguir informe se as frases fornecidas são
iguais. Observação: realizar esta verificação caractere por caractere. */

import java.util.Scanner;
public class L0717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase1, frase2;
        boolean iguais = true;

        System.out.print("Digite a primeira frase: ");
        frase1 = scanner.nextLine();
        System.out.print("Digite a segunda frase: ");
        frase2 = scanner.nextLine();

        if (frase1.length() != frase2.length()) {
            iguais = false;
        } else {
            for (int i = 0; i < frase1.length(); i++) {
                if (frase1.charAt(i) != frase2.charAt(i)) {
                    iguais = false;
                    break;
                }
            }
        }

        if (iguais) {
            System.out.println("As frases são iguais.");
        } else {
            System.out.println("As frases são diferentes.");
        }
    }
}
