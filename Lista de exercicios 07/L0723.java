// Gabriel de Sousa Castro

/*Elabore um programa para obter o nome completo de uma pessoa e a seguir forneça o
sobrenome do nome completo informado. Por exemplo, para o nome completo: Omero
Francisco Bertol, o programa deverá fornecer como resultado: Bertol. */

import java.util.Scanner;
public class L0723 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o nome completo
        System.out.println("Digite o nome completo:");
        String nomeCompleto = scanner.nextLine();
        
        // Obtém o sobrenome
        String[] partes = nomeCompleto.split(" ");
        String sobrenome = partes[partes.length - 1];
        
        // Exibe o resultado
        System.out.println("O sobrenome é: " + sobrenome);
    }
}
