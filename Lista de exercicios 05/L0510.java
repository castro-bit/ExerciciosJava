import java.util.Scanner;

public class L0510 {
  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double salarioFixo, valorVendas, comissao, salarioTotal;
        
        System.out.print("Digite o salario fixo do vendedor: R$ ");
        salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o valor total das vendas efetuadas: R$ ");
        valorVendas = scanner.nextDouble();
        
        if (valorVendas <= 1500) {
            comissao = valorVendas * 0.03; 
        } else {
            comissao = 1500 * 0.03 + (valorVendas - 1500) * 0.05; 
        }
        
        salarioTotal = salarioFixo + comissao;
        
        System.out.printf("Salario total: R$ %.2f\n", salarioTotal);
    }
}
