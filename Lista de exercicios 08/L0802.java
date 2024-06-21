import java.util.Scanner;

public class L0802 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorB = new int[15];

        // Lendo os valores do vetor
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor da posição " + i + ":");
            vetorB[i] = scanner.nextInt();
        }

        // Imprimindo o vetor em ordem invertida
        System.out.println("Vetor B em ordem invertida:");
        for (int i = vetorB.length - 1; i >= 0; i--) {
            System.out.println(vetorB[i]);
        }

       
    }
}
