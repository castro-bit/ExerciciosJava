//Gabriel de Sousa Castro

/*Escreva um programa em Java para imprimir os 10 primeiros números inteiros maiores que 100.*/


public class L0603 {
	public static void main(String[] args) {
        int contador = 0;
        int numero = 101;

        System.out.println("Os 10 primeiros números inteiros maiores que 100 são:");

        while (contador < 10) {
            System.out.println(numero);
            numero++;
            contador++;
        }
    }
}

