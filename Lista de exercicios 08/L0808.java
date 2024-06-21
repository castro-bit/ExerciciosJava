/*Escreva um programa para ler 5 elementos do vetor F de inteiros. Calcular
e imprimir a soma dos elementos ímpares. Supor que o vetor poderá não ter
nenhum elemento com esta propriedade e neste caso, mostrar uma
mensagem. */

public class L0808 {
    public static void main(String[] args) {
        int[] F = new int[5];
        int soma = 0;
        boolean temImpar = false;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o valor da posição " + i + ": ");
            F[i] = Integer.parseInt(System.console().readLine());
        }
        
        for (int i = 0; i < 5; i++) {
            if (F[i] % 2 != 0) {
                soma += F[i];
                temImpar = true;
            }
        }
        
        if (temImpar) {
            System.out.println("A soma dos elementos ímpares é: " + soma);
        } else {
            System.out.println("Não há elementos ímpares no vetor.");
        }
        
    }
    
}
