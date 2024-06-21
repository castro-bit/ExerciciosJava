// Gabriel de Sousa Castro

import java.util.Scanner;
public class ADivisivelporB {
	
	public static void main (String[] args) {
	int a, b;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o valor de  A entre 1 e 1000");
	a = scanner.nextInt();
	System.out.println("Digite o valor de  B entre 1 e 20 ");
	b = scanner.nextInt();		
		
	if (a < 1 || a > 1000 || b < 1 || b > 20) {
            System.out.println("VALOR INVALIDO");
            return;
        }
     if (a < b){
     System.out.println("O valor de a deve ser maior ou igual o valor de b"); 
     return; 
 }
     if (a%b ==0){
		 System.out.println("A é Divisivel por B");
	 }else{
		 System.out.println("Não é divisivel");
		 }	  
        	
	}
}



