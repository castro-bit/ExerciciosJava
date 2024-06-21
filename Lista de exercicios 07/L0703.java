// Gabriel de Sousa Castro

/*
Declarar uma variável do tipo String com seu valor inicial igual a branco e a
seguir atribuir as letras minúsculas do alfabeto (abcde...z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.
 */


public class L0703 {
	
	public static void main (String[] args) {

        // Declarar uma variável do tipo String com valor inicial igual a branco ("")
        String alfabeto = "";
        char letra;

        // Adicionar as letras maiúsculas do alfabeto (A-Z) uma-a-uma
        for (letra = 'a'; letra <= 'z'; letra++) {
            alfabeto += letra; // é o mesmo que alfabeto = alfabeto + letra 
        }

        System.out.println("Alfabeto: " + alfabeto);
    }
}


		
	

