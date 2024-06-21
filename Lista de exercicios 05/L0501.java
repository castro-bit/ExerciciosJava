//Gabriel de Sousa Castro

import java.util.Scanner;

public class L0501 {
	
	public static void main (String[] args) {
		
		int numero;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número");
		numero= scanner.nextInt();
		
		
		if (numero > 10){
			System.out.println("O numero é maior que 10 !");
		}else{
			System.out.println("O numero NÃO é maior que 10 !");
		}
}
}



