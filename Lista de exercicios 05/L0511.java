/*Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
e ‘/’. Calcule e mostre a operação efetuada e o seu resultado.*/

import java.util.Scanner;

public class L0511 {
  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int valor1, valor2, resultado;
        char operacao; 
        
        System.out.println("Digite o primeiro valor");
        valor1 = scanner.nextInt();
        
        System.out.println("Digite o segundo valor");
        valor2 = scanner.nextInt();
        
        System.out.println("Digite a operação desejada (+, -, *, /):");
        operacao = scanner.next().charAt(0);
        
        switch(operacao){
            case '+':
                resultado = valor1 + valor2;
                System.out.println("Resultado da adição: " + resultado);
                break;
                
            case '-':
                resultado = valor1 - valor2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
                
            case '*':
                resultado = valor1 * valor2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            
            case '/':
                resultado = valor1 / valor2;
                System.out.println("Resultado da divisão: " + resultado);
                break;
                
        }
    }
}
  