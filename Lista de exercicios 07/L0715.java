// Gabriel de Sousa Castro

/*Escreva um programa que informe se em uma frase fornecida pelo usuário existem
caracteres numéricos. */

import java.util.Scanner;
public class L0715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        boolean temNumero = false;

        System.out.print("Digite uma frase: ");
        frase = scanner.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))) {
                temNumero = true;
                break;
            }
        }

        if (temNumero) {
            System.out.println("A frase contém números.");
        } else {
            System.out.println("A frase não contém números.");
        }
        
    }
    
}
