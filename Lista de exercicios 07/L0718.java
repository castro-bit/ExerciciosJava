// Gabriel de Sousa Castro

/*18) Desenvolva um programa que leia uma cadeia de caracteres e através de uma mensagem
indique se esta cadeia representa uma sequência binária de 8 bit’s ou não.
Ex:
- não é uma sequência de 8bit’s: 01101, 10192898, 10001jaA
- é uma sequência de 8bit’s: 01101011, 10110101, 10000000 */

import java.util.Scanner;
public class L0718 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String binario;
        boolean valido = true;

        System.out.print("Digite uma sequência binária de 8 bits: ");
        binario = scanner.nextLine();

        if (binario.length() != 8) {
            valido = false;
        } else {
            for (int i = 0; i < binario.length(); i++) {
                if (binario.charAt(i) != '0' && binario.charAt(i) != '1') {
                    valido = false;
                    break;
                }
            }
        }

        if (valido) {
            System.out.println("É uma sequência de 8 bits.");
        } else {
            System.out.println("Não é uma sequência de 8 bits.");
        }
    }
    
}
