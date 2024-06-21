import java.util.Scanner;
import java.util.ArrayList;

public class prova01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade;

        do {
            System.out.println("Digite a quantidade de termos da sequência de números primos (0 para sair):");
            quantidade = scanner.nextInt();

            // Validação da entrada para garantir que seja positiva
            while (quantidade < 0) {
                System.out.println("Valor inválido. Por favor, digite uma quantidade positiva:");
                quantidade = scanner.nextInt();
            }

            if (quantidade > 0) {
                ArrayList<Integer> primos = new ArrayList<>();
                int numero = 2; // Número a ser testado para verificar se é primo

                // Enquanto a lista de primos não atingir a quantidade desejada
                while (primos.size() < quantidade) {
                    if (ehPrimo(numero)) {
                        primos.add(numero);
                    }
                    numero++;
                }

                // Imprime a sequência de primos em ordem inversa
                System.out.println("Sequência de números primos em ordem inversa:");
                for (int i = primos.size() - 1; i >= 0; i--) {
                    System.out.print(primos.get(i) + " ");
                }
                System.out.println(); // Quebra de linha após imprimir a sequência
            }
        } while (quantidade != 0);

        System.out.println("Programa encerrado.");
    }

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        for (int divisor = 2; divisor <= numero / 2; divisor++) {
            if (numero % divisor == 0) {
                return false; // Não é primo
            }
        }
        return true; // É primo
    }
}