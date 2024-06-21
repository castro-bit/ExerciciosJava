//Gabriel de Sousa Castro
import java.util.Scanner;
public class L0605 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valorN; 
		
		
		
		do {
		    System.out.println("Digite o valor para N");
		valorN = scanner.nextInt();
		if (valorN <= 0){
		    System.out.println("Digite um valor maior que 0 ");
		}
		
		
		} while (valorN <= 0);
		
		System.out.println("Os valores inteiro entre 1 e " +valorN+ ":");
		
		for(int i=1; i <= valorN; i++){
			System.out.println(i); 
		}
		
		
		
		
	}
}

