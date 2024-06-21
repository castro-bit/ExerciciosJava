// Gabriel de Sousa Castro

/*Desenvolva um programa que leia uma String (que representa uma sequência de dígitos
0's e 1's) e que determine o tamanho da maior sequência consecutiva de números 1 existente
na String. No exemplo seguinte a maior cadeia consecutiva de números 1 tem tamanho 8
(oito).
001010100110110100001011101111111101101001011000 */


import java.util.Scanner;
public class L0724 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma sequência de dígitos 0's e 1's
        System.out.println("Digite uma sequência de dígitos 0's e 1's:");
        String sequencia = scanner.nextLine();
        
        int contador = 0;
        int maior = 0;
        
        // Procura pela maior sequência de números 1 consecutivos
        for (int i = 0; i < sequencia.length(); i++) {
            if (sequencia.charAt(i) == '1') {
                contador++;
            } else {
                if (contador > maior) {
                    maior = contador;
                }
                contador = 0;
            }
        }
        
        // Exibe o resultado
        System.out.println("A maior sequência de números 1 consecutivos tem tamanho " + maior);
    }
}
