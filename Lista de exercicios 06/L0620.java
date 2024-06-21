//Gabriel de Sousa Castro
/*Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido.*/

import java.util.Random;
public class L0620{

    public static void main(String[] args) {
        Random random = new Random();

        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < 100; i++) {
            int valor = random.nextInt(101); 

            if (valor > maiorValor) {
                maiorValor = valor;
            }
            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("Maior valor gerado aleatoriamente: " + maiorValor);
        System.out.println("Menor valor gerado aleatoriamente: " + menorValor);
    }
}

        
        
        
        
