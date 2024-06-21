//Gabriel de Sousa Castro
/* mesmo exercício anterior, mas agora, 
considere que o segundo valor lido poderá ser maior ou menor que o primeiro valor lido, 
ou seja, deve-se testá-los.*/

import java.util.Scanner;

public class L0615 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;
        int soma = 0;
        
        System.out.println("Digite o primeiro Numero");
        valor1 = scanner.nextInt();
        
        System.out.println("Digite o segundo Numero");
        valor2 = scanner.nextInt();
        
    
        for(int i = valor1; i <= valor2; i++ ){
                soma += i ;
            }
            
            System.out.println("A soma dos numeros inteiros entre "+ valor1+ " e "+valor2+ " é : " +soma+ ".");
        } 
        
    }
