// Gabriel de Sousa Castro

/*Escreva um programa em Java para ler 10 números. 
Todos os números lidos com valor inferior a 40 devem ser somados. 
Escreva o valor final da soma efetuada.*/

import java.util.Scanner;

public class L0613 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero = scanner.nextInt();
            if (numero < 40) {
                soma += numero;
            }
        }

        System.out.println("A soma dos números menores que 40 é: " + soma);
    }
}
