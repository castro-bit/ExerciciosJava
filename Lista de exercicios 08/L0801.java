/*Escreva um programa para ler um vetor A de 15 posições e imprimir seus
elementos. */
import java.util.Scanner;

public class L0801 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[15];
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            A[i] = in.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
        
    }
}

    
