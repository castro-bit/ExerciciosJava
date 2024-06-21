//Gabriel de Sousa Castro

//Escreva um programa em Java que calcule e imprima a tabuada do 8 (1 a 10).

public class L0606{
	public static void main(String[] args) {
	    
		int num = 8;
		
		for(int i=1; i<=10; i++){
		    int resultado = num * i;
		    System.out.println("A Tabuada do 8 é : " + resultado);
		}
	}
}
