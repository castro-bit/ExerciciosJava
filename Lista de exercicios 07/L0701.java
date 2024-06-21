//Gabriel de Sousa Castro

public class L0701 {
    public static void main(String[] args) {
        System.out.println("Tabela de Caracteres ASCII:");
        for (int i = 32; i < 128; i++) {
            // Imprime o codigo ASCII e o caractere correspondente
            System.out.printf("Codigo %3d: %c%n", i, (char) i);
        }
    }
}

