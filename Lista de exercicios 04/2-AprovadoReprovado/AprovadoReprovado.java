//Gabriel de Sousa Castro

import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("VALOR INVÁLIDO");
        } else {
            if (nota < 6) {
                System.out.println("REPROVADO");
            } else {
                System.out.println("APROVADO");
            }
        }

        scanner.close();
    }
}
