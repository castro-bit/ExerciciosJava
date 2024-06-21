// Gabriel de Sousa Castro

/*Escreva um programa em Java para ler 10 valores e escrever 
quantos desses valores lidos estão no intervalo [10,20] 
(incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.*/

import java.util.Scanner;

public class L0609 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor: ");
            int valor = input.nextInt();

            if (valor >= 10 && valor <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.println("Valores dentro do intervalo [10,20]: " + dentroIntervalo);
        System.out.println("Valores fora do intervalo [10,20]: " + foraIntervalo);

      
    }
}