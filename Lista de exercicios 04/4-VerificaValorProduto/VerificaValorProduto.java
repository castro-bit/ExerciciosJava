//Gabriel de Sousa Castro

import java.util.Scanner;

public class VerificaValorProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoProduto1, precoProduto2;
        
      System.out.print("Digite o valor do Produto 1: ");
      precoProduto1 = scanner.nextDouble();
      
      System.out.print("Digite o valor do Produto 2: ");
      precoProduto2 = scanner.nextDouble();
      
      if (precoProduto1 < 1 || precoProduto1 > 1000 || precoProduto2 < 1 || precoProduto2 > 1000) {
            System.out.println("VALOR INVALIDO");
            return;
        }
		
		if (precoProduto1 < precoProduto2){
		System.out.println("O produto 1 é mais barato");
			
		}else{
		System.out.println("O produto 2 é mais barato");
				
				}
		  
		  }
      }
	  
      
      
      
      
   

      
      
        
       
