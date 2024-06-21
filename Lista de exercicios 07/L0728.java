/*Escreva um programa que leia uma String e “dobre” ela ao meio concatenado seus
caracteres.
Ex:
Entrada: Macaco Caco quer banana (tamanho ímpar)
Saída: Maancaancaob rCeaucqo
Entrada: Batatinha quando nasce (tamanho par)
Saída: Beactsaatniondhnaa uq */
import java.util.Scanner;

public class L0728 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        
        int meio = frase.length() / 2;
        StringBuilder resultado = new StringBuilder();
        
        // Para tamanho ímpar, ajusta o ponto médio para incluir o caractere central na primeira metade
        String primeiraMetade = frase.substring(0, meio + frase.length() % 2);
        String segundaMetade = frase.substring(meio + frase.length() % 2);
        
        // Concatena os caracteres das duas metades
        for (int i = 0; i < primeiraMetade.length() || i < segundaMetade.length(); i++) {
            if (i < primeiraMetade.length()) {
                resultado.append(primeiraMetade.charAt(i));
            }
            if (i < segundaMetade.length()) {
                resultado.append(segundaMetade.charAt(i));
            }
        }
        
        System.out.println("Saída: " + resultado.toString());
    }
}
