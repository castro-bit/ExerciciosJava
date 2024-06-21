// Gabriel de Sousa Castro

import java.util.Scanner;

public class L0711 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma frase
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        
        int contadorAlfabeticos = 0, contadorDigitos = 0;
        
        // Percorre cada caractere da frase para contar alfabéticos e dígitos
        for (int i = 0; i < frase.length(); i++) {
            char caractereAtual = frase.charAt(i);
            if (Character.isLetter(caractereAtual)) {
                contadorAlfabeticos++;
            } else if (Character.isDigit(caractereAtual)) {
                contadorDigitos++;
            }
        }
        
        // Exibe os resultados
        System.out.println("Quantidade de caracteres alfabéticos: " + contadorAlfabeticos);
        System.out.println("Quantidade de dígitos numéricos: " + contadorDigitos);
    }
}