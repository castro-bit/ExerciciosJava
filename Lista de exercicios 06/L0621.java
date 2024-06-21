//Gabriel de Sousa Castro

/*Escreva um programa em Java para ler uma quantidade
e a seguir ler esta quantidade de números. 
Depois de ler todos os números o algoritmo deve apresentar na tela 
o maior dos números lidos e a média dos números lidos.
*/


import java.util.Scanner;

public class L0621 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qntNumeros, numerosDigitados, i, maior = Integer.MIN_VALUE;
        int soma = 0;
        double media;

        System.out.println("Digite a Quantidade de numeros que serão digitados");
        qntNumeros = scanner.nextInt();

        for (i = 1; i <= qntNumeros; i++) {
            System.out.print("Digite o número #" + i + ": ");
            numerosDigitados = scanner.nextInt();

            soma += numerosDigitados;

            if (numerosDigitados > maior) {
                maior = numerosDigitados;
            }
        }

        media = (double) soma / qntNumeros;

        System.out.println("O maior número digitado é: " + maior);
        System.out.println("A média dos números digitados é: " + media);

        scanner.close();
    }
}
