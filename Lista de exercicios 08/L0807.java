/*Escreva um programa para ler um vetor E (de inteiros), de tamanho N (N<=20),
determinar e imprimir o maior e o menor elemento deste vetor.*/


import java.util.Scanner;
public class L0807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int[] E = new int[20];
        int maior = 0;
        int menor = 0;
        
        do {
            System.out.print("Informe o tamanho do vetor: ");
            n = scanner.nextInt();
        } while (n <= 0 | n > 20);
        
        for (int i = 0; i < n; i++) {
            System.out.print("Informe o valor da posição " + i + ": ");
            E[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                maior = E[i];
                menor = E[i];
            } else {
                if (E[i] > maior) {
                    maior = E[i];
                }
                if (E[i] < menor) {
                    menor = E[i];
                }
            }
        }
        
        System.out.println("O maior elemento do vetor é: " + maior);
        System.out.println("O menor elemento do vetor é: " + menor);
        
    }
    
}
