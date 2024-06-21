//Gabriel de Sousa Castro
/*Escreva um programa em Java para ler 2 valores, 
calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos 
(incluindo os valores lidos na soma). 
Considere que o segundo valor lido será sempre maior que o primeiro valor lido.*/


import java.util.Scanner;

public class L0614 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;
        int soma = 0;
        
        System.out.println("Digite o primeiro Numero");
        valor1 = scanner.nextInt();
        
        System.out.println("Digite o segundo Numero");
        valor2 = scanner.nextInt();
        
        if(valor2 <= valor1){
            System.out.println("O segundo numero nao pode ser menor que o primeiro");
        
            
        }else{
            
            for(int i = valor1; i <= valor2; i++ ){
                soma += i ;
            }
            
            System.out.println("A soma dos numeros inteiros entre "+ valor1+ " e "+valor2+ " é : " +soma+ ".");
        } 
        
    }
}