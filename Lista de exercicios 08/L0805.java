/*Escreva um programa para ler 2 vetores de dimensão n (n<=15) e calcular a soma
entre eles gerando um terceiro vetor de mesma dimensão. */

import java.util.Scanner;
public class L0805 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int[] A = new int[15];
        int[] B = new int[15];
        int[] C = new int[15];
        
        do {
            System.out.print("Informe o tamanho dos vetores: ");
            n = scanner.nextInt();
        } while (n <= 0 | n > 15);
        
        for (int i = 0; i < n; i++) {
            System.out.print("Informe o valor da posição " + i + " do vetor A: ");
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("Informe o valor da posição " + i + " do vetor B: ");
            B[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("O valor da posição " + i + " do vetor C é: " + C[i]);
        }
        
    }
    
}
