// Gabriel de Sousa Castro

/*Declarar uma variável do tipo String com seu valor inicial igual a branco e a
seguir atribuir as letras maiúsculas do alfabeto (ABCDE...Z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.*/


public class L0702 {
    public static void main(String[] args) {
        // Declarar uma variável do tipo String com valor inicial igual a branco ("")
        String alfabeto = "";
        char letra;

        // Adicionar as letras maiúsculas do alfabeto (A-Z) uma-a-uma
        for (letra = 'A'; letra <= 'Z'; letra++) {
            alfabeto += letra; // é o mesmo que alfabeto = alfabeto + letra 
        }

        System.out.println("Alfabeto: " + alfabeto);
    }
}

