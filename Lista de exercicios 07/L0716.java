// Gabriel de Sousa Castro

/*Escreva um programa que informe se todos os caracteres alfabéticos de uma frase
fornecida pelo usuário são maiúsculos. */

import java.util.Scanner;
public class L0716{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        boolean todosMaiusculos = true;

        System.out.print("Digite uma frase: ");
        frase = scanner.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i)) && !Character.isUpperCase(frase.charAt(i))) {
                todosMaiusculos = false;
                break;
            }
        }

        if (todosMaiusculos) {
            System.out.println("Todos os caracteres alfabéticos da frase são maiúsculos.");
        } else {
            System.out.println("Nem todos os caracteres alfabéticos da frase são maiúsculos.");
        }
        
    }
    
}
