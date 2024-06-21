// Gabriel de Sousa Castro

/*
Escreva um programa para ler uma frase e um caractere. Sempre que o caractere lido
aparecer na frase ele deve ser substituído por asterisco. Por exemplo, se os valores fornecidos
fossem para a frase: o dia esta nublado, e para o caractere: a, o programa deverá fornecer o
seguinte resultado: o di* est* nubl*do.
 */

import java.util.Scanner;

public class L0714 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração e inicialização das variáveis
        String frase;
        String fraseModificada = "";
        char letra;
        char caractereAtual;

        // Ler a frase do usuário
        System.out.println("Digite uma frase:");
        frase = scanner.nextLine();

        // Ler o caractere a ser substituído
        System.out.println("Digite um caractere para ser substituído:");
        letra = scanner.nextLine().charAt(0);

        // Fechar o scanner
        scanner.close();

        // Percorrer a frase e substituir as ocorrências do caractere
        for (int i = 0; i < frase.length(); i++) {
            caractereAtual = frase.charAt(i);
            if (caractereAtual == letra) {
                fraseModificada += '*';
            } else {
                fraseModificada += caractereAtual;
            }
        }

        // Exibir o resultado
        System.out.println("A frase modificada é: " + fraseModificada);
    }
}
