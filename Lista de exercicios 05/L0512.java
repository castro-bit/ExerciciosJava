import java.util.Scanner(System.in);
public class l0512
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    double precoProduto;
        int codigoOrigem;
        double frete, precoFinal;

        System.out.print("Digite o preço do produto: R$ ");
        precoProduto = scanner.nextDouble();

        System.out.print("Digite o código de origem do produto: ");
        codigoOrigem = scanner.nextInt();

        switch (codigoOrigem) {
            case 1:
                frete = precoProduto * 0.10;
                System.out.println("Região de procedência: Norte");
                break;
            case 2:
            case 5:
            case 9:
                frete = precoProduto * 0.03;
                System.out.println("Região de procedência: Sul");
                break;
            case 3:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                frete = precoProduto * 0.012;
                System.out.println("Região de procedência: Leste");
                break;
            case 7:
            case 20:
                frete = precoProduto * 0.073;
                System.out.println("Região de procedência: Oeste");
                break;
            default:
                frete = precoProduto * 0.222;
                System.out.println("Região de procedência: Importado");
        }

        precoFinal = precoProduto + frete;

        System.out.printf("Preço do produto: R$ %.2f\n", precoProduto);
        System.out.printf("Valor do frete: R$ %.2f\n", frete);
        System.out.printf("Preço final a ser pago: R$ %.2f\n", precoFinal);
    }
}
	}
}