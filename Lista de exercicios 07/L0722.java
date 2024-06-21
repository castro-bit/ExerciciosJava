// Gabriel de Sousa Castro

/*Dados uma frase e uma palavra, escreva um programa que verifique o número de vezes
que a palavra ocorre na frase. Exemplo: Na frase ANA E MARIANA GOSTAM DE BANANA, a
palavra ANA ocorre 4 vezes. */

import java.util.Scanner;

public class L0722 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma frase
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine().toUpperCase(); // Converte a frase para maiúsculo
        
        // Solicita ao usuário que insira uma palavra
        System.out.println("Digite uma palavra para contar na frase:");
        String palavra = scanner.nextLine().toUpperCase(); // Converte a palavra para maiúsculo
        
        int contador = 0;
        int index = 0;
        
        // Procura por ocorrências da palavra na frase
        while ((index = frase.indexOf(palavra, index)) != -1) {
            contador++;
            index += palavra.length(); // Move o índice para frente para continuar a busca
        }
        
        // Exibe o resultado
        System.out.println("A palavra '" + palavra + "' ocorre " + contador + " vezes na frase.");
    }
}
