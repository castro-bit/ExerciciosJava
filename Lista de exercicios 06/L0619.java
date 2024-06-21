//Gabriel de Sousa Castro

/*19) O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque. 
Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar 
‘MAIS MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque 
e a média de valor das mercadorias em estoque.*/

import java.util.Scanner;
public class L0619{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalValor = 0;
        int numeroMercadorias = 0;

        char continuar;

        do {
            // Entrada do valor da mercadoria
            System.out.print("Digite o valor da mercadoria: R$ ");
            double valorMercadoria = input.nextDouble();

            // Adiciona o valor da mercadoria ao total
            totalValor += valorMercadoria;
            numeroMercadorias++;

            // Pergunta se deseja adicionar mais mercadorias
            System.out.print("MAIS MERCADORIAS (S/N)? ");
            continuar = input.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        // Verifica se houve pelo menos uma mercadoria adicionada
        if (numeroMercadorias == 0) {
            System.out.println("Nenhuma mercadoria adicionada ao estoque.");
            return;
        }

        // Cálculo da média de valor das mercadorias
        double mediaValor = totalValor / numeroMercadorias;

        // Saída dos resultados
        System.out.println("Valor total em estoque: R$ " + totalValor);
        System.out.println("Média de valor das mercadorias: R$ " + mediaValor);

      
    }
}
