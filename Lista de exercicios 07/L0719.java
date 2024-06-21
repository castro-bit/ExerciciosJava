// Gabriel de Sousa Castro

/* Escreva um programa que leia uma cadeia de caracteres qualquer é determine se a
palavra lida representa um palíndromo ou não (exemplo de palavras palíndromas: ovo, natan,
sos, arara, etc). */
import java.util.Scanner;
public class L0719 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;
        boolean palindromo = true;

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
}
