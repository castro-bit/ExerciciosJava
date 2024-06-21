// Gabriel de Sousa Castro
/*Escreva um programa em Java para ler 10 valores, 
calcular e escrever a média aritmética desses valores lidos.*/

import java.util.Scanner;

public class L0610 {
    public static void main(String[] args) {
        int soma = 0;
        double media;
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor: ");
            int valor = scanner.nextInt();
            soma += valor;
        }

        media = (double) soma / 10;
        System.out.println("A média aritmética dos valores é " + media);

        
    }
}