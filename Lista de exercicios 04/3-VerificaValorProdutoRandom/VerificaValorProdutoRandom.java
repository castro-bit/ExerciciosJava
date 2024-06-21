//Gabriel de Sousa Castro

import java.util.Random;

public class VerificaValorProdutoRandom {
    public static void main(String[] args) {
        // Gera dois números aleatórios entre 1 e 1000 (inclusos) o +1 serve pra incluir o 1000 e excluir o 0
        Random random = new Random();
        int precoProduto1 = random.nextInt(1000) + 1;
        int precoProduto2 = random.nextInt(1000) + 1;

        // Verifica qual produto é o mais barato
        if (precoProduto1 < precoProduto2) {
            System.out.println("O produto 1 é o mais barato");
        } else if (precoProduto2 < precoProduto1) {
            System.out.println("O produto 2 é o mais barato");
        } else {
            System.out.println("Os preços dos dois produtos são iguais");
        }
    }
}

