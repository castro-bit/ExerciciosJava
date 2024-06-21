//Gabriel de Sousa Castro

/*Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.*/

import java.util.Scanner;
public class L0608{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        int contNegativos = 0;

        System.out.println("Digite 10 valores inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            valor = scanner.nextInt();

            if (valor < 0) {
                contNegativos++;
            }

            System.out.println("Você digitou: " + valor);
        }

        System.out.println("Total de números negativos digitados: " + contNegativos);
    }
}