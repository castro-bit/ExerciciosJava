// Gabriel de Sousa Castro

/*10) Escreva um programa que calcule e escreva a quantidade de letras maiúsculas de uma
frase fornecida pelo usuário. */
import java.util.Scanner;

public class L0710 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declara uma variável para armazenar a frase fornecida pelo usuário
        String frase;
        // Declara uma variável para armazenar a quantidade de letras maiúsculas
        int contador = 0;

        // Solicita ao usuário que insira uma frase
        System.out.println("Digite uma frase");
        // Lê a frase fornecida pelo usuário e a armazena na variável 'frase'
        frase = scanner.nextLine();

        // Itera sobre cada caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            // Verifica se o caractere atual é uma letra maiúscula
            if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
                // Se for uma letra maiúscula, incrementa o contador
                contador++;
            }
        }

        // Imprime a quantidade de letras maiúsculas encontradas na frase
        System.out.println("Quantidade de letras maiúsculas: " + contador);
    }
}