/*Escreva um programa para ler um vetor D de N posições, onde N é menor
ou igual a 20 e imprimir seus elementos. O usuário deve informar o número
de posições e os elementos. O programa deve validar a quantidade de
posições, não permitindo que o usuário forneça um valor inválido.*/

import java.util.Scanner;

public class L0804 {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    int n;
    
    do {
        
        System.out.print("Informe o tamanho do vetor: ");
    n = scanner.nextInt();
    
}while (n <=0 | n>20);
int[] D = new int [n];

    for (int i = 0; i < n; i++) {
        System.out.print("Informe o valor da posição " + i + ": ");
        D[i] = scanner.nextInt();
    }

    for ()
    
}


    

    
}
