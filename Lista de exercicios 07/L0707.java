// Gabriel de Sousa Castro

/*Escreva um programa para ler uma frase fornecida pelo usuário e contar a
quantidade de cada caractere do alfabeto, imprimindo ao final uma listagem, onde
consta o caractere e na frente a quantidade de ocorrências. Caso não tenha ocorrência
apresentar o valor zero. Não diferenciar maiúsculo de minúsculo*/

import java.util.Scanner;

public class L0707 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma frase
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine().toLowerCase(); // Converte a frase para minúsculo
        
        // Inicializa um array para contar as ocorrências de cada letra do alfabeto
        int[] contadorLetras = new int[26]; // 26 letras no alfabeto 
        
        // Conta as ocorrências de cada letra na frase
        for (int i = 0; i < frase.length(); i++) {
            char atual = frase.charAt(i);
            if (atual >= 'a' && atual <= 'z') { // Verifica se o caractere é uma letra
                contadorLetras[atual - 'a']++; // Incrementa o contador para a letra correspondente
            }
        }
        
        // Imprime a quantidade de ocorrências de cada letra
        for (int i = 0; i < contadorLetras.length; i++) {
            System.out.println((char) ('a' + i) + ": " + contadorLetras[i]);
        }
    }
}
