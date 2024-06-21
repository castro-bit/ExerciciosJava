//Gabriel de Sousa Castro

import java.util.Scanner;

public class L0503 {
	
	public static void main (String[] args) {
		int qnt;
		double valorUnidade = 1.00; 
		double valortotal;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quantidade de maçãs : ");
		
		qnt = scanner.nextInt();
		
		
		
		if (qnt < 12){
			valortotal = valorUnidade * qnt + 0.30 * qnt;
			 
		}else{
			valortotal= valorUnidade *qnt;
		}
		
		System.out.println("O valor total é " + valortotal);
			
	}
}

