//Gabriel de Sousa Castro
//Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).

public class L0616{
    public static void main(String[]args){
        int inicio = 15; 
        int fim = 100;
        int soma = 0;
        int contador = 0 ;
        double media;
        
        for (int i = inicio; i <= fim; i++){
            soma += i; 
            contador++;
        }
        
        media = soma / contador;
        
        System.out.println("A média aritmética dos números inteiros entre " + inicio + " e " + fim + " (incluindo ambos) é: " + media);
        
        
    }
}