// Gabriel de Sousa Castro

//Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos.


import java.util.Scanner;

public class L0612 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero, soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma total dos 10 números lidos é: " + soma);

    }
}


        