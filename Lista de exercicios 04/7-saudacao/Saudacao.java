//Gabriel de Sousa Castro

import java.util.Scanner;
import java.util.Random;

public class Saudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int hora;

        System.out.println("Deseja informar a hora manualmente (1) ou gerar aleatoriamente (2)?");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a hora do dia (0-23):");
            hora = scanner.nextInt();
        } else if (escolha == 2) {
            hora = random.nextInt(24); // Gera um número aleatório entre 0 e 23
            System.out.println("Hora gerada aleatoriamente: " + hora);
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
            return;
        }

        if (hora >= 0 && hora <= 6) {
            System.out.println("Zzzzz");
        } else if (hora >= 7 && hora <= 11) {
            System.out.println("Bom dia");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}
