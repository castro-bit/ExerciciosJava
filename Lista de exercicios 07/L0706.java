// Gabriel de Sousa Castro

import java.util.Scanner;

public class L0706 {

    public static void main(String[] args) {
        // Declaração das variáveis
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        String frase; // Variável para armazenar a frase digitada pelo usuário
        char caractere; // Variável para armazenar o caractere que será contado
        int contador = 0; // Variável para contar o número de vezes que o caractere aparece na frase

        // Solicita ao usuário que insira uma frase
        System.out.println("Digite uma frase:");
        frase = scanner.nextLine(); // Lê a frase inteira digitada pelo usuário

        // Solicita ao usuário que insira um caractere
        System.out.println("Digite um caractere para contar na frase:");
        caractere = scanner.nextLine().charAt(0); // Lê o primeiro caractere da entrada do usuário

        // Converte a frase e o caractere para minúsculo para ignorar a diferença entre
        // maiúsculas e minúsculas
        frase = frase.toLowerCase(); // Converte a frase para letras minúsculas
        caractere = Character.toLowerCase(caractere); // Converte o caractere para letra minúscula

        // Conta quantas vezes o caractere aparece na frase
        for (int i = 0; i < frase.length(); i++) { // Percorre cada caractere da frase
            if (frase.charAt(i) == caractere) { // Verifica se o caractere atual da frase é igual ao caractere procurado
                contador++; // Se for igual, incrementa o contador
            }
        }

        // Exibe o resultado
        System.out.println("O caractere '" + caractere + "' aparece " + contador + " vezes na frase."); // Mostra o
                                                                                                        // resultado ao
                                                                                                        // usuário
    }
}
